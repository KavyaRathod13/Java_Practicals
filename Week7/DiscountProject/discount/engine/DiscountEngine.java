package Week7.DiscountProject.discount.engine;

public class DiscountEngine
{
    public static void applyDiscount(double[] prices, DiscountRule rule)
    {
        for(double price : prices)
        {
            double newPrice = rule.apply(price);
            System.out.println("Original: " + price +"  Discounted: " + newPrice);
        }
    }
}
