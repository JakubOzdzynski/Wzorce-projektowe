package patterns.behavioral.chainOfResponsibility;

public class EmployeeDepartmentCheck extends AccessCheck {
    @Override
    public boolean doCheck(String userName) {
        System.out.println("Employee Department Check for " + userName);

        if ("sales".equals(Employees.checkEmployeeDepartment(userName))) {
            System.out.println("Employee department FAILED for " + userName);
            return false;
        } else {
            System.out.println("Employee department for " + userName);
            return checkNextElement(userName);
        }
    }
}

