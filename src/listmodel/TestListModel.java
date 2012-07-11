package listmodel;

import listmodel.att.GetText;

public class TestListModel {
        public static void main(String[] args) {
                ListModel list = new ListModel();
                list.addItem("hello there");
                list.addItem("hi how are you doing");
                list.addItem("end this programming session");
                list.addItem("DON'T");

                Observer obs = new PrintAttributes();
                list.registerObserver(obs);
                list.setAttributesTemplate(new GetText());

                list.notifyObservers();
        }
}