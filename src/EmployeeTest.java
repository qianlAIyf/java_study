import java.io.*;
public class EmployeeTest {
    public static void main(String args[]){
        Employee oneEmp = new Employee("yf");

        oneEmp.setAge(18);
        oneEmp.setDesignation("software engineer");
        oneEmp.setSalary(10000);
        oneEmp.printEmployee();

        int a = 10;
        System.out.println(++a);
    }
}
