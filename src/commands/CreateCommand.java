package commands;

import listmodel.ListModel;

public class CreateCommand implements Command {
        public CreateCommand(Receiver rec, String text) {
                this.rec = rec;
                this.text = text;
        }

        public void execute() {
                ((ListModel)rec).addItem(text);
        }
        public void undo() {}

        private Receiver rec;
        private String text;
}