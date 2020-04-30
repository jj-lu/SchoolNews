package core04_05;

import java.util.Random;

public class Employee {
    //静态属性域
    private static int nextId;

    private int id;
    private String name = "";
    private double salary;

    //静态代码块
    static {
        Random generator = new Random();
        nextId = generator.nextInt(10000);
        System.out.println("静态代码块");
    }

    //代码块
    {
        id = nextId;
        nextId++;
        System.out.println("代码块");
    }

    //三个构造方法

    public Employee() {
        System.out.println("构造方法一");
    }

    public Employee(double salary) {
        this("Employee #"+nextId,salary);
        System.out.println("构造方法二");
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("构造方法三");
    }

    //get方法

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
