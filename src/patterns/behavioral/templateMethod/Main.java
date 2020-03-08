package patterns.behavioral.templateMethod;

public class Main {
    public static void main(String[] args) {
        EmailNewsProvider provider = new EmailNewsProvider();
        provider.setEmailContent("Mail content");
        provider.provideNews();
    }
}
