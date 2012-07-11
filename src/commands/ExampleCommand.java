package commands;

public class ExampleCommand implements Command {

        public ExampleCommand(Receiver rec) {
                this.rec = rec;
        }
        
        public void execute() {}

        public void undo() {}
        private Receiver rec;
}