package patterns.structral.proxy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CompanyEmployees empleoyess = new CompanyEmployees();
        List<String> employeeList = Arrays.asList("Anna", "Maria", "Karol", "Jan");
        empleoyess.setEmployees(employeeList);

        CompanyInternetNetwork internetNetwork = new ProxyCompanyInternetAcces();
        internetNetwork.getAcces("Maria");
        internetNetwork.getAcces("Marek");
    }
}
