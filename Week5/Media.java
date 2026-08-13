package Week5;

import java.util.*;
public abstract class Media 
{
    String title;
    Media(String title)
    {
        this.title=title;
    }
    abstract double lateFees(int days);
}

class CD extends Media
{
    CD(String title)
    {
        super(title);
    }
    double lateFees(int days)
    {
        return days*3;
    }
}

class DVD extends Media
{
    DVD(String title)
    {
        super(title);
    }
    double lateFees(int days)
    {
        return days*4;
    }
}

class Journal extends Media
{
    Journal(String title)
    {
        super(title);
    }
    double lateFees(int days)
    {
        return days*5;
    }
}

class MediaDemo
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        Media m[]=new Media[3];
        int days[]=new int[3];

        System.out.println("Enter CD title: ");
        String cd=sc.next();
        System.out.println("Enter number of days late: ");
        days[0]=sc.nextInt();
        m[0]=new CD(cd);

        System.out.println("Enter DVD title: ");
        String dvd=sc.next();
        System.out.println("Enter number of days late: ");
        days[1]=sc.nextInt();
        m[1]=new DVD(dvd);

        System.out.println("Enter Journal title: ");
        String journal=sc.next();
        System.out.println("Enter number of days late: ");
        days[2]=sc.nextInt();
        m[2]=new Journal(journal);
        System.out.println();

        double t=0;
        for(int i=0;i<m.length;i++)
        {
            double f=m[i].lateFees(days[i]);
            System.out.println(m[i].title+" Late fees="+f);
            t+=f;
        }
        System.out.println("Total Fees="+t);
    }
}
