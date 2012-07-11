package commands;

public class CommandFactory {
        public CommandFactory(Receiver rec) {
                this.rec = rec
        }
        
        public Command createCommand(String command) {
                if(command.equals("create"))
                        return new CreateCommand();
        }

        private Receiver rec;
}