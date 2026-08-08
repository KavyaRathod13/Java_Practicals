package Week4;

public class ChatFilter 
{
    String filterLogs(String log[],String s)
    {
        StringBuilder sb=new StringBuilder();
        int c=0;
        for(String i:log)
        {
            String parts[]=i.split(" ",3);
            if(parts.length<3)
                continue;
            String time=parts[0],user=parts[1],msg=parts[2];
            if(msg.toLowerCase().contains(s.toLowerCase()))
            {
                c++;
                sb.append(time).append(" ").append(user).append(": ").append(msg).append("\n");
            }
        }
        return "Matches: "+c+"\n"+sb.toString();
    }
}
    
