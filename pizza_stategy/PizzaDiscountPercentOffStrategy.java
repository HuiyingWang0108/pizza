public class PizzaDiscountPercentOffStrategy implements PizzaDiscountStrategy{

    private Float percentage;
    private Integer discountAmountThreshold;

    public PizzaDiscountStrategy(String params) {
     
        this.percentage = JsonObject.parse(params).get("percent");
        this.discountAmountThreshold = JsonObject.parse(params).get("amount");
    }

    @Override
    public float getDiscount(int amount, float price) {

        if (amount >= discountAmountThreshold) {
            return price * amount * this.percentage;
        } 
        return 0;
    }
    @Override
    public String getDiscountDescription() {

        return "Get " + this.percentage + " off";
    }

    
}
