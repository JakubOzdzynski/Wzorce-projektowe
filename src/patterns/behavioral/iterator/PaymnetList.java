package patterns.behavioral.iterator;

public class PaymnetList implements MyList<Payment> {
    private Payment[] payments;
    public PaymnetList(Payment[] payments) {
        this.payments = payments;
    }

    @Override
    public MyIterator<Payment> iterator() {
        return new PaymentIterator(payments);
    }
}
