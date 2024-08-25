package n2;

import n2.models.StockMarketAgency;
import n2.models.StockMarketAgent;

public class StockMarketApp {

    public static void testApp(){
        StockMarketAgent stockMarketAgent = new StockMarketAgent();

        StockMarketAgency agencyA = new StockMarketAgency("Agency A");
        StockMarketAgency agencyB = new StockMarketAgency("Agency B");
        StockMarketAgency agencyC = new StockMarketAgency("Agency C");

        stockMarketAgent.subscribe(agencyA);
        stockMarketAgent.subscribe(agencyB);
        stockMarketAgent.subscribe(agencyC);

        stockMarketAgent.unsubscribe(agencyB);

        stockMarketAgent.setMarketStatus(5.7);

        stockMarketAgent.setMarketStatus(3.8);

    }
}
