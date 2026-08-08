package Week3;
import java.util.*;
public class CardDriver 
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of cards");
        int n=sc.nextInt();
        Card cards[]=new Card[n];
        boolean duplicateFound = false;
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter rank");
            String rank=sc.next();
            System.out.println("Enter suit");
            String suit=sc.next();
            Card newCard = new Card(rank, suit);

            for (int j = 0; j < i; j++) 
            {

                if (newCard.equals(cards[j])) 
                {
                    System.out.println("Duplicate found: " + newCard);
                    duplicateFound = true;
                    break;
                }
            }
            cards[i]=newCard;
            if(duplicateFound)
                break;
        }
    }
}
