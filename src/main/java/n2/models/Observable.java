package n2.models;

public abstract class Observable {
    public abstract void subscribe(Observer observer);
    public abstract void unsubscribe(Observer observer);
    public abstract void notifyObservers();
}
