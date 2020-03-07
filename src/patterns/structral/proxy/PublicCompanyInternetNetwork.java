package patterns.structral.proxy;

public class PublicCompanyInternetNetwork implements CompanyInternetNetwork {
    private String username;

    public PublicCompanyInternetNetwork(String username) {
        this.username = username;
    }

    @Override
    public void getAcces(String username) {
        System.out.println("Public network acces granted for " + username);
    }
}
