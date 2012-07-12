package listmodel.att;

import listmodel.item.Item;

public class GetModifiedTime extends AttributesTemplate {
        public String hook(Item i) {
                return new String(String.valueOf(i.getId()) + " " + String.valueOf(i.getModifiedTime()));
        }
}