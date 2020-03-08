package patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class AllegroMediator implements Mediator {
    private ArrayList<Customer> biddingCustomers;

    public AllegroMediator() {
        biddingCustomers = new ArrayList<>();
    }

    @Override
    public void addBuyer(Customer customer) {
        if(!biddingCustomers.contains(customer))
            biddingCustomers.add(customer);
    }

    @Override
    public void findHighestBidder() {
        int maxBid = 0;
        Customer winning = null;
//        for(Customer customer : biddingCustomers) {
//            if(customer.price > maxBid) {
//                maxBid = customer.price;
//                winning = customer;
//            }
//        }
        winning = Collections.max(biddingCustomers, Comparator.comparing(c -> c.price));
        System.out.println("Auction winner is: " + winning.name + " with bid: " + winning.price);
    }
}
