package patterns.behavioral.templateMethod;

public class EmailNewsProvider extends NewsProvider{

    public void setEmailContent(String content) {
        this.message = content;
    }

    @Override
    public boolean authorize() {
        System.out.println("Email authorization");
        return true;
    }

    @Override
    public boolean endConnection() {
        System.out.println("Email log off");
        return true;
    }
}
