package patterns.behavioral.chainOfResponsibility;

public class Employee {
    private String name;
    private Integer levle;
    private String department;

    public Employee(String name, Integer levle, String department) {
        this.name = name;
        this.levle = levle;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public Integer getLevle() {
        return levle;
    }

    public String getDepartment() {
        return department;
    }
}
