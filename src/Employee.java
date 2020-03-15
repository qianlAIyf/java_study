import java.io.*;

public class Employee {
    String name;
    int age;
    String designation;
    double salary;
    //constructor
    public Employee(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public  void setDesignation(String designation){
        this.designation = designation;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void printEmployee(){
        System.out.println("name:" + name);
        System.out.println("age:" + age);
        System.out.println("designation:" + designation);
        System.out.println("salary:" + salary);
    }
}
