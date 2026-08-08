package Week3;

public class FractionDriver 
{
    public static void main(String arg[])
    {
    Fraction[] f = {
    new Fraction(1, 2),
    new Fraction(2, 4),
    new Fraction(3, 6)
    };

System.out.println(f[0]);
System.out.println(f[1]);
System.out.println(f[2]);

System.out.println("f1 equals f2: " + f[0].equals(f[1]));
System.out.println("f2 equals f3: " + f[1].equals(f[2]));
System.out.println("f1 equals f3: " + f[0].equals(f[2]));
    }
}
