package n2.models;

public class StockMarketAgency extends Observer {


    public StockMarketAgency(String name) {
        super(name);
    }


    @Override
    public void update(double marketStatus) {
        System.out.println("The current market status is: " + marketStatus + "%");
    }
}
