package patterns.behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        Payment[] payments = {
                new Payment("woda"),
                new Payment("prąd"),
                new Payment("gaz"),
        };
        PaymnetList paymentList = new PaymnetList(payments);
        MyIterator<Payment> paymentMyIterator = paymentList.iterator();
                System.out.println("Lista płatności: ");
        while(paymentMyIterator.hasNext()) {
            Payment currentPayment = paymentMyIterator.next();
            System.out.println(currentPayment.getName());
        }
    }
}
