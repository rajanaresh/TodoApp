package listmodel.getter;

import listmodel.item.Item;

public class GetText extends GetterTemplate {
        public GetText(ListModel listmodel) {
                super(listmodel);
        }
        
        public String hook(Item i) {
                return i.getText();
        }
}