package Week5;

import java.util.*;
abstract class Employee 
{
    String name;
    int id;
    Employee (String name,int id)
    {
        this.name=name;
        this.id=id;
    }
    abstract double monthlySalary();  
}

class FullTime extends Employee 
{
    double salary;
    FullTime(String name,int id,double salary)
    {
        super(name,id);
        this.salary=salary;
    }
    double monthlySalary()
    {
        return salary;
    }
}

class PartTime extends Employee 
{
    int hours;
    double rate;
    PartTime(String name,int id,int hours,double rate)
    {
        super(name,id);
        this.hours=hours;
        this.rate=rate;
    }
    double monthlySalary()
    {
        return hours*rate;
    }
}

class Intern extends Employee 
{
    double stipend;
    Intern(String name,int id,double stipend)
    {
        super(name,id);
        this.stipend=stipend;
    }
    double monthlySalary()
    {
        return stipend;
    }
}

public class Payroll
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        Employee obj[]=new Employee[3];

        System.out.println("Enter FullTime employee name: ");
        String n1=sc.next();
        System.out.println("Enter the id: ");
        int id1=sc.nextInt();
        System.out.println("Enter monthly salary: ");
        double s=sc.nextDouble();
        obj[0]=new FullTime(n1,id1,s);

        System.out.println("Enter PartTime employee name: ");
        String n2=sc.next();
        System.out.println("Enter the id: ");
        int id2=sc.nextInt();
        System.out.println("Enter numbers of hours worked: ");
        int h=sc.nextInt();
        System.out.println("Enter rate per hour: ");
        double rate=sc.nextDouble();
        obj[1]=new PartTime(n2,id2,h,rate);

        System.out.println("Enter Intern's name: ");
        String n3=sc.next();
        System.out.println("Enter the id: ");
        int id3=sc.nextInt();
        System.out.println("Enter the stipend: ");
        double stipend=sc.nextDouble();
        obj[2]=new Intern(n3,id3,stipend);

        double t=0;
        System.out.println();
        for(Employee e: obj)
        {
            if(e instanceof FullTime)
            System.out.println(e.name + "'s Salary (FullTime)="+e.monthlySalary());
            else if(e instanceof PartTime)
            System.out.println(e.name + "'s Salary (PartTime)="+e.monthlySalary());
            else if(e instanceof Intern)
            System.out.println(e.name + "'s Salary (Intern)="+e.monthlySalary());
            if ( e instanceof Intern)
                System.out.println("Note: " + e.name+" is an intern");
            t+=e.monthlySalary();
        }
        System.out.println("Total="+t);
    }   
}
