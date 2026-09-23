package Week7.DiscountProject.discount.engine;

@FunctionalInterface
public interface DiscountRule
{
    double apply(double price);
}