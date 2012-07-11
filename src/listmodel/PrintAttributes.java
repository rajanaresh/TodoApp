package listmodel;

import java.util.Iterator;
import java.util.Set;
import listmodel.att.AttributesTemplate;

public class PrintAttributes implements Observer {
        public void update(Observable obs, Object arg) {
                Set att = ((ListModel)obs).getItemAttributes();
                System.out.println("Size = " + att.size());
                Iterator it = att.iterator();
                while(it.hasNext()) {
                        System.out.println(it.next());
                }
        }
}