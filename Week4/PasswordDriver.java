package Week4;

public class PasswordDriver 
{
    public static void main(String arg[])
    {
        PasswordChecker obj=new PasswordChecker();
        String pw[]={"abc","Abcd1234","Hello@1345","kavya@111","Pass123","Abcd123!"};
        for(String p:pw)
        {
            System.out.println(p+" -> "+ obj.strength(p));
        }
    }
    
}
