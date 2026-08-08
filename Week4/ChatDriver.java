package Week4;

import java.util.*;
public class ChatDriver 
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the keyword to be searched:");
        String s=sc.nextLine();
        String log[]={"1:05 alice Hello there","06:25 Jack How are you","Good morning","12:12 Kavya Hello guys"};
        ChatFilter obj=new ChatFilter();
        System.out.println(obj.filterLogs(log,s));
        sc.close();
    }   
}
