package commands;

public class EditCommand implements Command {
        public EditCommand(Receiver rec, int id, String text) {
                this.rec = rec;
                this.id = id;
                this.text = text;
        }
        
        public void execute() {
                rec.changeItem(id, text);
        }
        public void undo() {}

        private Receiver rec;
        private int id;
        private String text;
}