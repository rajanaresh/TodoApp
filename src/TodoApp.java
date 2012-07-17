import listmodel.*;
import listmodel.item.Item;
import listmodel.att.*;
import commands.*;

import java.util.Iterator;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

/** Make the app multithreaded. Will resolve a lot of dependencies*/
public class TodoApp {
        
        public static void main(String[] args) {
                
                //instantiate stuff - model, commandInvoker, commandFactory
                
                ListModel list = new ListModel();
                CommandInvoker invoker = new CommandInvoker();
                CommandFactory commfactory = new CommandFactory(list);
                
                //register observers
                //read conf files from a separate thread to make it dynamic
                //registration of observers
                
                /**Separate thread for registering observers would be better*/
                Set<Observer> obs = new HashSet<Observer>();
                obs.add(new PrintAttributes());
                Iterator<Observer> it = obs.iterator();
                while(it.hasNext()) {
                        list.registerObserver(it.next());
                }

                Scanner sc = new Scanner(System.in);
                String input = "";
                String command = "";
                Scanner cmd = null;
                List<String> arguments = null;

                /**Remove business logic from the client code*/
                //loop for the commands
                printHelp();
                while(true) {
                        System.out.print(">> ");
                        input = sc.nextLine();
                        cmd = new Scanner(input).useDelimiter("\\s");
                        command = cmd.next();
                        arguments = new ArrayList<String>();
                        while(cmd.hasNext()) {
                                arguments.add(cmd.next());
                        }
                        invoker.invoke(commfactory.createCommand(command, arguments));
                }
                
        }
        public static void printHelp() {
                System.out.println("Command Help");
                System.out.println("============");
                System.out.println("create [your text]");
                System.out.println("printtext");
                System.out.println("remove [text ID]");
                System.out.println("edit [text ID] [your text]");
        }
}