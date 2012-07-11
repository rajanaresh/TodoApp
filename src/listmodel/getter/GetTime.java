package listmodel.getter;

import listmodel.item.Item;

public class GetTime extends GetterTemplate {
        public GetTime(ListModel listmodel) {
                super(listmodel);
        }
        
        public String hook(Item i) {
                return i.getTime();
        }
}
