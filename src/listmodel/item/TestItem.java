package listmodel.item;

public class TestItem {
        public static void main(String[] args) {
                Item i1 = new Item(2, "hello text");
                Item i2 = new Item(3, "world text");

                System.out.println(i1.getTime() + " " + i2.getTime());
                System.out.println(i1.getModifiedTime() + " " + i2.getModifiedTime());
                System.out.println(i1.getText() + " " + i2.getText());
                i1.modifyText("world text");
                i2.modifyText("hello text");
                System.out.println(i1.getText() + " " + i2.getText());
                Item i3 = new Item(3, "totally different");
                System.out.println(String.valueOf(i2.equals(i3)));
                
        }
}