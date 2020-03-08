package patterns.behavioral.chainOfResponsibility;

public class EmployeeSeniorityCheck extends AccessCheck {
    @Override
    public boolean doCheck(String userName) {
        System.out.println("Employee Seniority Check for " + userName);
        if(Employees.checkEmployeeLevel(userName) > 10) {
            System.out.println("Employee seniority for " + userName);
            return checkNextElement(userName);
        }
        System.out.println("Employee seniority FAILED for " + userName);
        return false;
    }
}
