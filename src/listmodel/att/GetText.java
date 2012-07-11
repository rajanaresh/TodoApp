package listmodel.att;

import listmodel.item.Item;

public class GetText extends AttributesTemplate {
        public String hook(Item i) {
                return new String(String.valueOf(i.getId()) + " " + i.getText());
        }
}