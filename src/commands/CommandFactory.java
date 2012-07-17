package commands;

import java.util.List;
import java.lang.Integer;

public class CommandFactory {
        public CommandFactory(Receiver rec) {
                this.rec = rec;
        }
        
        public Command createCommand(String command, List<String> args) {
                try {
                if(command.equals("create"))
                        return new CreateCommand(rec, args.get(0));
                else if(command.equals("edit"))
                        return new EditCommand(rec, Integer.valueOf(args.get(0)), args.get(1));
                else if(command.equals("remove"))
                        return new RemoveCommand(rec, Integer.valueOf(args.get(0)));
                else if(command.equals("printtext"))
                        return new PrintTextCommand(rec);
                else
                        return new ExampleCommand(rec);
                
                } catch(NumberFormatException e) {
                        System.out.println("This is where it happens");
                        return new ExampleCommand(rec);
                }
        }

        private Receiver rec;
}