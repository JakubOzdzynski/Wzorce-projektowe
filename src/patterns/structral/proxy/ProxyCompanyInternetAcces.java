package patterns.structral.proxy;

public class ProxyCompanyInternetAcces implements CompanyInternetNetwork {
    CompanyInternetNetwork internetNetwork;

    private boolean isEmployee(String uesername) {
        return CompanyEmployees.isActiveEmployee(uesername);
    }

    @Override
    public void getAcces(String username) {
        if (isEmployee(username)) {
            internetNetwork = new PrivateCompanyInternetNetwork(username);
        } else {
            internetNetwork = new PublicCompanyInternetNetwork(username);
        }
        internetNetwork.getAcces(username);
    }
}
