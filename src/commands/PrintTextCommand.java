package commands;

import listmodel.att.GetText;
import listmodel.ListModel;

public class PrintTextCommand implements Command {
        public PrintTextCommand(Receiver rec) {
                this.rec = rec;
        }
        
        public void execute() {
                ((ListModel)rec).setAttributesTemplate(new GetText());
                ((ListModel)rec).notifyObservers();
        }
        public void undo() {}
        
        private Receiver rec;
}