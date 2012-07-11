package listmodel.getter;

import listmodel.item.Item;

public abstract class GetterTemplate {

        /** ListModel will be singleton and always has to be instantiated with that*/
        /** ListModel and this class are tightly coupled */
        public GetterTemplate(ListModel listobject) {
                this.listobject = listobject;
        }
        public Set templateMethod() {
                Set returnset = new HashSet();
                Set itemset = listobject.entries();
                Iterator it = itemset.iterator();
                while(it.hasNext()) {
                        Map.Entry temp = it.next();
                        returnset.add(hook(temp.getValue()));
                }
                return returnset;
        }
        public abstract String hook(Item i);
        /** Example
            -------
            return i.getX...X()) */

        private ListModel listobject;
}