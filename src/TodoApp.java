import listmodel.*;
import listmodel.item.Item;
import listmodel.getter.*;
import commands.*;

/** Make the app multithreaded. Will resolve a lot of dependencies*/
public class TodoApp {
        
        public static void main(String[] args) {
                
                //instantiate stuff - model, commandInvoker, commandFactory
                
                ListModel list = new ListModel();
                CommandInvoker invoker = new CommandInvoker();

                //register observers
                //read conf files from a separate thread to make it dynamic
                //registration of observers
                
                /**Separate thread for registration purpose would be better*/
                Set<Observer> obs = new HashSet();
                obs.add(new PrintAttributes());
                Iterator it = obs.iterator();
                while(it.hasNext()) {
                        list.registerObserver(it.next());
                }
                
                //loop for the commands
                printHelp();
                while(true) {
                        System.out.print(">> ");
                        
                }
                
        }
        public static void printHelp() {
                System.out.println("Command Help");
                System.out.println("============");
                System.out.println("create [your text]");
                System.out.println("print");
                System.out.println("remove [text ID]");
                System.out.println("edit [text ID] [your text]");
                System.out.println("help");
        }
}