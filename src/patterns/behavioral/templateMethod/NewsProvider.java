package patterns.behavioral.templateMethod;

public abstract class NewsProvider {
    private int id;
    String message;

    public abstract boolean authorize();

    public final boolean sendMessage() {
        System.out.println("Message sent: " + message);
        return true;
    }
    public abstract boolean endConnection();

    public final void provideNews() {
        authorize();
        sendMessage();
        endConnection();
    }
}
