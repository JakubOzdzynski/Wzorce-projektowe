package patterns.behavioral.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Employees employees = new Employees();
        employees.addEmployee("Jan", 5, "accountant");
        employees.addEmployee("Maria", 12, "sales");
        employees.addEmployee("Wiesław", 11, "purchasing");

        AccessCheck accessCheck = new CompanyInsideCheck();
        accessCheck.addChainElement(new EmployeeSeniorityCheck());
        accessCheck.addChainElement(new EmployeeDepartmentCheck());

        Company company = new Company("Taka firma");
        company.setCheck(accessCheck);

        System.out.println("====================");
        company.enterRoom("Jan");
        System.out.println("====================");
        company.enterRoom("Paweł");
        System.out.println("====================");
        company.enterRoom("Maria");
        System.out.println("====================");
        company.enterRoom("Wiesław");
        System.out.println("====================");
    }
}
