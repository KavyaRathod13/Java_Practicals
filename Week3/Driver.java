package Week3;
import java.util.*;
class Driver 
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of points");
        int n=sc.nextInt();
        Point points[] = new Point[n];

        for (int i = 0; i < n; i++) 
        {
            System.out.print("Point " + (i + 1) + " (x y): ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            points[i] = new Point(x, y);
        }
        
        int N = 0;
        for (int i = 0; i < points.length; i++) {
            boolean found = false;

            for (int j = 0; j < i; j++) {
                if (points[i].equals(points[j])) {
                    found = true;
                    break;
                }
            }

            if (!found)
                N++;
        }
        System.out.println("Distinct: " +N);
    }
}


    