package listmodel.getter;

import listmodel.item.Item;

public class GetModifiedTime extends GetterTemplate {
        public GetModifiedTime(ListModel listmodel) {
                super(listmodel);
        }
        
        public String hook(Item i) {
                return i.getModifiedTime();
        }
}