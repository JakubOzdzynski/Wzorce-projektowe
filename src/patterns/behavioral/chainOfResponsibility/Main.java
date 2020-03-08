package patterns.behavioral.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Employees employees = new Employees();
        employees.addEmployee("Jan", 5);
        employees.addEmployee("Maria", 12);
        employees.addEmployee("Wiesław", 8);

        AccessCheck accessCheck = new CompanyInsideCheck();
        accessCheck.addChainElement(new EmployeeSeniorityCheck());

        Company company = new Company("Taka firma");
        company.setCheck(accessCheck);

        System.out.println("====================");
        company.enterRoom("Jan");
        System.out.println("====================");
        company.enterRoom("Paweł");
        System.out.println("====================");
        company.enterRoom("Maria");
        System.out.println("====================");
        company.enterRoom("Wisław");
        System.out.println("====================");
    }
}
