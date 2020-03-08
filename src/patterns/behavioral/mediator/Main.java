package patterns.behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new AllegroMediator();
        Customer customer1 = new AllegroCustomer(mediator, "Janek");
        Customer customer2 = new AllegroCustomer(mediator, "Marek");
        Customer customer3 = new AllegroCustomer(mediator, "Paweł");

        mediator.addBuyer(customer1);
        mediator.addBuyer(customer2);
        mediator.addBuyer(customer3);
        System.out.println("First seek:");
        customer1.bid(300);
        customer2.bid(500);
        customer3.bid(400);
        mediator.findHighestBidder();
        System.out.println("Second seek:");
        customer2.cancelBid();
        mediator.findHighestBidder();
    }
}
