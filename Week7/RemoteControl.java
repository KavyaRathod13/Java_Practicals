package Week7;

interface Switchable
{
    void on();
    void off();
    default void toggle()
    {
        System.out.println("Toggling device");
    }
}

class Fan implements Switchable
{
    public void on()
    {
        System.out.println("Fan is ON");
    }
    public void off()
    {
        System.out.println("Fan is OFF");
    }
}

class Light implements Switchable
{
    public void on()
    {
        System.out.println("Light is ON");
    }
    public void off()
    {
        System.out.println("Light is OFF");
    }
}

@FunctionalInterface 
interface Permission
{
    boolean Switch(Switchable device, int h);
}

public class RemoteControl 
{
    public static void main(String arg[])
    {
        Switchable s[]={new Fan(),new Light()};
        for(Switchable i: s)
        {
            i.toggle();
        }
        Permission p1=new Permission() 
        {
                public boolean Switch(Switchable device, int h)
                    {
                        return h>=6 && h<=20;
                    }
        }; 
        
        System.out.println("Anonymous class: "+p1.Switch(s[0],10));  
        Permission p=(device,h)->h>=6 && h<=20;  
        System.out.println("Lambda: "+p.Switch(s[1],25));   
    } 
}
