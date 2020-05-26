package core06_04;

public class CloneTest {
    public static void main(String[] args) {
        Employee employee = new Employee("john",50000);
        try {
            Employee clone = employee.clone();
            clone.setHireDay(2019,5,28);
            clone.raiseSalary(10);
            System.out.println(employee);
            System.out.println(clone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
