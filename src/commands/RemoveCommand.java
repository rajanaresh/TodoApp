package commands;

public class RemoveCommand implements Command {
        public RemoveCommand(Receiver rec, int id) {
                this.rec = rec;
                this.id = id;
        }

        public void execute() {
                rec.removeItem(id);                
        }
        public void undo() {}

        private Receiver rec;
        private int id;
}