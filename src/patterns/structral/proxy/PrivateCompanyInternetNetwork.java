package patterns.structral.proxy;

public class PrivateCompanyInternetNetwork implements CompanyInternetNetwork {
    private String username;

    public PrivateCompanyInternetNetwork(String username) {
        this.username = username;
    }

    @Override
    public void getAcces(String username) {
        System.out.println("Private network acces granted for " + username);
    }
}

