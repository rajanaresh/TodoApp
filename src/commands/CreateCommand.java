package commands;

public class CreateCommand implements Command {
        public CreateCommand(Receiver rec, String text) {
                this.rec = rec;
                this.text = text;
        }

        public void execute() {
                rec.addItem(arg);
        }
        public void undo() {}

        private Receiver rec;
        private String text;
}