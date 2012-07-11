package listmodel.att;

import listmodel.item.Item;

public class GetTime extends AttributesTemplate {
        public String hook(Item i) {
                return new String(String.valueOf(i.getId()) + " " + String.valueOf(i.getModifiedTime()));
        }
}