package listmodel;

public class PrintAttributes extends Observer {
        public void update(Observable obs, object arg) {
                Set att = obs.getItemAttributes();
                System.out.println("Size = " + add.size());
                Iterator it = add.iterator();
                while(it.hasNext()) {
                        System.out.println(it.next());
                }
        }
}