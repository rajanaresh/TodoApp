package listmodel;

public class ObservableAdaptor implements Observable {

        public ObservableAdaptor() {
                this(new HashSet());
        }
        public ObservableAdaptor(Set observers) {
                this.observers = observers;
        }
                                            
        public void registerObserver(Observer obs) {
                observers.add(obs);
        }
        public void removeObserver(Observer obs) {
                observers.remove(obs);
        }
        public void notifyObservers() {
                notifyObserver(null);
        }
        public void notifyObservers(Object arg) {
                for(Observer t: observers) {
                        t.update(this, arg);
                }
        }
        public boolean notifyObserver(Observer obs, Object arg) {
                if(contains(obs)) {
                        obs.update(this, arg);
                        return true;
                }
                return false;
        }
        
        private Set observers;
}