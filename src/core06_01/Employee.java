package core06_01;

public class Employee implements Comparable<Employee> {
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee() {
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    private void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(salary,o.salary);
    }
}
