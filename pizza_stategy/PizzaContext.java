public class PizzaContext {

    private PizzaDiscountStrategy strategy;

    public PizzaContext(String discount_type, String params) {

        switch (discount_type) {

            case "N/A":
                strategy = new PizzaDiscountNAStratyegy();
                break;

            case "BNGXOFF":
                strategy = new PizzaDiscountPercentOffStrategy(params);
                break;

        }
    }

    public PizzaDiscountStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(PizzaDiscountStrategy strategy) {
        this.strategy = strategy;
    }
    
}
