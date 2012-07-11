package commands;

import listmodel.getter.GetText;

public class PrintTextCommand extends Command {
        public PrintTextCommand(Receiver rec) {
                this.rec = rec;
        }
        
        pubic void execute() {
                rec.setGetter(new GetText(rec));
                rec.notifyObservers();
                                
        }
        public void undo() {}
        
        private Receiver rec;
}