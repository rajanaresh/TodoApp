package listmodel;

import listmodel.item.Item;

/** Will make this class a singleton */
public class ListModel extends ObservableAdaptor implements Receiver {

        public ListModel() {
                this(new HashMap<int, Item>(), false);
        }
        public ListModel(Map<int, Item> items, boolean change) {
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
                int temp = rand.nextInt();
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

        /** ALL GETTER METHODS FOR THE OBSERVER. Used template pattern for these
        public Set getItemAttributes() {
                return getter.templateMethod();
        }
        */

        public Set getItemAttributes() {
                Set returnset = new HashSet();
                Set itemset = items.values();
                Iterator it = itemset.iterator();
                while(it.hasNext()) {
                        returnset.add(att.hook(it.next()));
                }
        }

        /**
           public void setGetter(GetterTemplate getter) {
                this.getter = getter;
        }
        public GetterTemplate getGetter() {
                return getter;
        }
        public Set entries() {
                return items.entrySet();
        }
        */

        private Map<int, Items> items;
        private boolean change;
        private Random rand;
        private AttributesTemplate att = new AttributesTemplate();
        /** private GetterTemplate getter;*/
}

