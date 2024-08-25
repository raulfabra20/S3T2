package n2.models;

import java.util.ArrayList;

public class StockMarketAgent extends Observable {
    private ArrayList<Observer> agencies;
    private double marketStatus;

    public StockMarketAgent() {
        this.agencies = new ArrayList<>();
        this.marketStatus = 0.0;
    }

    public void setMarketStatus(double status) {
        this.marketStatus = status;
        notifyObservers();
    }

    @Override
    public void subscribe(Observer observer) {
        agencies.add(observer);
        System.out.println(observer.getName()+" subscribed");
    }

    @Override
    public void unsubscribe(Observer observer){
        agencies.remove(observer);
        System.out.println(observer.getName()+" unsuscribed");
    }

        @Override
        public void notifyObservers () {
            System.out.println("Notifying observers...");
            agencies.forEach(a -> a.update(marketStatus));
        }
    }

