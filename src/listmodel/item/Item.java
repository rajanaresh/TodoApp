package listmodel.item;

import java.util.Calendar;
import java.util.Date;
import java.lang.Math;

public class Item {

        public Item(int id, String text) {
                this.id = id;
                this.text = text;
                cal = Calendar.getInstance();
                date = cal.getTime();
                mdate = cal.getTime();
        }
        
        public Date getTime() {
                return date;
        }
        public Date getModifiedTime() {
                return mdate;
        }

        /**Only getter which doesn't return a String. Need to be decided*/
        public int getId() {
                return id;
        }
        public String getText() {
                return text;
        }
        
        /**PRIVATE*/
        private void setText(String text) {
                this.text = text;
        }
        
        public void modifyText(String text) {
                setText(text);
                mdate = cal.getTime();
        }
        public boolean equals(Item item) {
                return (this.id == item.id);
        }
        
        private int id;
        private String text = "";
        private Date date, mdate;
        private Calendar cal;
}