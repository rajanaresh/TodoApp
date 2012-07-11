package listmodel;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class ObservableAdaptor implements Observable {

        public ObservableAdaptor() {
                this(new HashSet<Observer>());
        }
        public ObservableAdaptor(Set<Observer> observers) {
                this.observers = observers;
        }
                                            
        public void registerObserver(Observer obs) {
                observers.add(obs);
        }
        public void removeObserver(Observer obs) {
                observers.remove(obs);
        }
        public void notifyObservers() {
                notifyObservers(null);
        }
        public void notifyObservers(Object arg) {
                Iterator<Observer> it = observers.iterator();
                while(it.hasNext()) {
                        Observer t = it.next();
                        t.update(this, arg);
                }
        }
        public boolean notifyObserver(Observer obs, Object arg) {
                if(observers.contains(obs)) {
                        obs.update(this, arg);
                        return true;
                }
                return false;
        }
        
        private Set<Observer> observers;
}