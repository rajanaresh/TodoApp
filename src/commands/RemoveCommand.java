package commands;

import listmodel.ListModel;

public class RemoveCommand implements Command {
        public RemoveCommand(Receiver rec, Integer id) {
                this.rec = rec;
                this.id = id;
        }

        public void execute() {
                ((ListModel)rec).removeItem(id);                
        }
        public void undo() {}

        private Receiver rec;
        private Integer id;
}