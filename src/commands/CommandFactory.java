package commands;

public class CommandFactory {
        public CommandFactory(Receiver rec) {
                this.rec = rec
        }
        
        public Command createCommand(String command, Object[] args) {
                if(command.equals("create"))
                        return new CreateCommand(rec, args[0]);
                else if(command.equals("edit"))
                        return new EditCommand(rec, args[0], args[1]);
                else if(command.equals("remove"))
                        return new RemoveCommand(rec, args[0]);
                else if(command.equals("printtext"))
                        return new PrintTextCommand(rec);
        }

        private Receiver rec;
}