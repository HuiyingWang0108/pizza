public interface PizzaDiscountStrategy {

   public float getDiscount(int amount, float price);
    public String getDiscountDescription();
}
