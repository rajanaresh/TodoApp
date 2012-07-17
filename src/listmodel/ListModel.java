package listmodel;

import commands.Receiver;
import listmodel.att.AttributesTemplate;
import listmodel.item.Item;

import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Random;
import java.lang.Math;

/** Will make this class a singleton */
/** Check for autoboxing and unboxing issues */
public class ListModel extends ObservableAdaptor implements Receiver {

        public ListModel() {
                this(new HashMap<Integer, Item>(), false);
        }
        public ListModel(Map<Integer, Item> items, boolean change) {
                this.items = items;
                this.change = change;
                rand = new Random();
        }
                
        public boolean hasChanged() {
                return change;
        }

        /**PRIVATE*/
        private void setChanged() {
                change = true;
        }
        /**PRIVATE*/
        private int uniqueInteger() {
                int temp = Math.abs(rand.nextInt());
                while(items.get(temp) != null)
                        temp = rand.nextInt();
                
                return temp;
        }

        /** ALL SETTER METHODS FOR THE COMMANDS use template pattern here as well*/
        
        /**Create command will use this*/
        public void addItem(String text) {
                int id = uniqueInteger();
                items.put(id, new Item(id, text));
                setChanged();
        }
        /**Remove command will use this*/
        public boolean removeItem(int id) {
                if(items.remove(id) != null) {
                        setChanged();
                        return true;
                } else
                        return false;
        }
        /**Edit command will use this*/
        public void changeItem(int id, String text) {
                Item temp = items.get(id);
                temp.modifyText(text);
                setChanged();
        }

        /** ALL GETTER METHODS FOR THE OBSERVER.  */

        public Set getItemAttributes() {
                Set<Object> returnset = new HashSet<Object>();
                Set<Map.Entry<Integer, Item>> entryset = items.entrySet();
                Iterator<Map.Entry<Integer, Item>> it = entryset.iterator();
                while(it.hasNext()) {
                        Map.Entry<Integer, Item> temp = it.next();
                        returnset.add(att.hook(temp.getValue()));
                }
                return returnset;
        }

        public void setAttributesTemplate(AttributesTemplate att) {
                this.att = att;
        }
        public AttributesTemplate getAttributesTemplate() {
                return att;
        }
        
        private Map<Integer, Item> items;
        private boolean change;
        private Random rand;
        private AttributesTemplate att;
        /** private GetterTemplate getter;*/
}

