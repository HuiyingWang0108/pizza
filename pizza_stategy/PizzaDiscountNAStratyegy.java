public class PizzaDiscountNAStratyegy implements PizzaDiscountStrategy{

    @Override
    public float getDiscount(int amount, float price) {
        
        return 0;
    }

    @Override
    public String getDiscountDescription() {

        return "No Discount";
    }
    
    
}
