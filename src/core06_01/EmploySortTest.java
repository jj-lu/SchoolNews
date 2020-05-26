package core06_01;

import java.util.Arrays;

public class EmploySortTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("harry",3500);
        staff[1] = new Employee("carl",7500);
        staff[2] = new Employee("tony",3800);

        Arrays.sort(staff);

        for(Employee employee : staff){
            System.out.println(employee.getName()+":"+employee.getSalary());
        }
    }
}
