//Class Employee with methods salary , getsalary , name , getname , setname

import java.util.Scanner;
class Employee{
    int salary;
    String EName;
    public int getSalary(){
        return salary;
    }
    public void setSalary(int Empsalary){
        this.salary=Empsalary;
    }
    public String getName(){
        return EName;
    }
    public void setName(String EmpName){
            this.EName=EmpName;
    }
}
public class P1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Employee emp=new Employee();
        System.out.println("Enter name of Employee ");
        String name=sc.next();
        System.out.println("Enter salary of employee");
        int salary=sc.nextInt();
        emp.setName(name);
        emp.setSalary(salary);
        System.out.println("Name of employee:"+ emp.getName());
        System.out.println("Salary of employee:"+ emp.getSalary());
    }
}

