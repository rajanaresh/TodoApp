package commands;

import listmodel.ListModel;

public class EditCommand implements Command {
        public EditCommand(Receiver rec, Integer id, String text) {
                this.rec = rec;
                this.id = id;
                this.text = text;
        }
        
        public void execute() {
                ((ListModel)rec).changeItem(id, text);
        }
        public void undo() {}

        private Receiver rec;
        private Integer id;
        private String text;
}