package patterns.behavioral.chainOfResponsibility;

import java.util.HashMap;
import java.util.Map;

public class Employees {
    private static Map<String, Employee> companyEmployees;

    public Employees() {
        this.companyEmployees = new HashMap<>();
    }

    public static Map<String, Employee> getCompanyEmployees() {
        return companyEmployees;
    }

    public boolean addEmployee(String newEmployee, int level, String department) {
        companyEmployees.put(newEmployee, new Employee(newEmployee, level, department));
        return true;
    }

    public static boolean checkEmployee(String userName) {
        return companyEmployees.keySet().contains(userName);
    }

    public static Integer checkEmployeeLevel(String userName) {
        return companyEmployees.get(userName).getLevle();
    }

    public static String checkEmployeeDepartment(String userName) {
        return companyEmployees.get(userName).getDepartment();
    }
}
