package question1;


public abstract class Observable {

    public abstract void add(Observer observer);
    public abstract void remove(Observer observer);
    private abstract void notifyObserver();
    public abstract int getObserverCount();
}
