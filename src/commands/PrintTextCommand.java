package commands;

import listmodel.att.GetText;

public class PrintTextCommand extends Command {
        public PrintTextCommand(Receiver rec) {
                this.rec = rec;
        }
        
        pubic void execute() {
                rec.setAttributesTemplate(new GetText());
                rec.notifyObservers();
                                
        }
        public void undo() {}
        
        private Receiver rec;
}