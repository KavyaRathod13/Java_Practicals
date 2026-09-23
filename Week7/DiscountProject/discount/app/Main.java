package Week7.DiscountProject.discount.app;

import java.util.Scanner;
import Week7.DiscountProject.discount.engine.*;

public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        double[] prices = {1000, 2000, 3000, 4000};

        System.out.println("1. 10% Discount");
        System.out.println("2. 20% Discount");
        System.out.println("3. Flat Rs. 500 Discount");

        System.out.print("Choose a rule: ");
        int choice = sc.nextInt();

        DiscountRule rule;

        if(choice == 1)
        {
            rule = price -> price * 0.90;
        }
        else if(choice == 2)
        {
            rule = price -> price * 0.80;
        }
        else
        {
            rule = price -> price - 500;
        }

        DiscountEngine.applyDiscount(prices, rule);
    }
}
