package Week5;

public abstract class Shape
{
    abstract double area();
}

class Circle extends Shape
{
    double r;
    Circle(double r)
    {
        this.r=r;
    }
    double area()
    {
        return 3.14*r*r;
    }
}

class Rectangle extends Shape
{
    double l,b;
    Rectangle(double l,double b)
    {
        this.l=l;
        this.b=b;
    }
    double area()
    {
        return l*b;
    }
}

class Triangle extends Shape
{
    double b,h;
    Triangle(double b,double h)
    {
        this.b=b;
        this.h=h;
    }
    double area()
    {
        return b*h/2;
    }
}

class Main
{
public static void main (String arg[])
{
    Shape s[]={new Circle(5),new Rectangle(4.3,8.2),new Triangle(7,3)};
    double t=0,max=0;
    for(Shape i:s)
    {
        double a=i.area();
        if(i instanceof Circle)
        System.out.println("Area of Circle="+a);
        else if(i instanceof Rectangle)
        System.out.println("Area of Rectangle="+a);
        else if(i instanceof Triangle)
        System.out.println("Area of Triangle="+a);
        t+=a;
        if(a>max)
            max=a;
    }
    System.out.println("\nTotal area="+t);
    System.out.println("Largest area="+max);
}
}

