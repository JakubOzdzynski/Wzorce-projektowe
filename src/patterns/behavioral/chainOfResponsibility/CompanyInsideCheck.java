package patterns.behavioral.chainOfResponsibility;

public class CompanyInsideCheck extends AccessCheck {
    @Override
    public boolean doCheck(String userName) {
        System.out.println("Company Insider Check for " + userName);
        if(Employees.checkEmployee(userName)) {
            System.out.println("Company insider passed for " + userName);
            return checkNextElement(userName);
        }
        System.out.println("Company insider FAILED for " + userName);
        return false;
    }
}
