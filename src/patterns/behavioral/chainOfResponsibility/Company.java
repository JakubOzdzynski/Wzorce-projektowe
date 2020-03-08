package patterns.behavioral.chainOfResponsibility;

public class Company {
    private String name;
    private Employees employees;
    private AccessCheck accessCheck;

    public Company(String name) {
        this.name = name;
    }
    public void setCheck(AccessCheck check) {
        this.accessCheck = check;
    }
    public boolean enterRoom(String userName) {
        if(accessCheck.doCheck(userName)) {
            System.out.println("Access granted for " + userName);
            return true;
        }
        System.out.println("Access forbidden for " + userName);
        return false;
    }
}
