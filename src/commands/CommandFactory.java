package commands;

import java.util.List;

public class CommandFactory {
        public CommandFactory(Receiver rec) {
                this.rec = rec;
        }
        
        public Command createCommand(String command, List<? extends Object> args) {
                if(command.equals("create"))
                        return new CreateCommand(rec, ((String)args.get(0)));
                else if(command.equals("edit"))
                        return new EditCommand(rec, ((Integer)args.get(0)), ((String)args.get(1)));
                else if(command.equals("remove"))
                        return new RemoveCommand(rec, ((Integer)args.get(0)));
                else if(command.equals("printtext"))
                        return new PrintTextCommand(rec);
                else
                        return new ExampleCommand(rec);
        }

        private Receiver rec;
}