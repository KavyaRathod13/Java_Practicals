package Week3;
import java.util.*;
public class Fraction 
{
    private int num,den;
    Fraction(int num,int den)
    {
        int g=gcd(num,den);
        this.num=num/g;
        this.den=den/g;
    }

    private int gcd(int a,int b)
    {
        while(b!=0)
        {
            int q=b;
            b=a%b;
            a=q;
        }
        return a;
    }

    @Override
    public String toString() 
    {
        return num + "/" + den;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this==obj)
            return true;
        if(obj==null||getClass()!=obj.getClass())
            return false;
        Fraction f=(Fraction)obj;
        return num==f.num&&den==f.den;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(num,den);
    }  
}
