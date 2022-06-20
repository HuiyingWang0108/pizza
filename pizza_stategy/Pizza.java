public class Pizza {

    private String name;
    private Integer inventory;
    private Float price;
    private PizzaContext pizzaContext;

    public Pizza(String name, Integer inventory,Float price, String discountType, String params) {

        this.name = name;
        this.inventory = inventory;
        this.price = price;
        this.pizzaContext = new PizzaContext(discountType, params);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {

        return "";
    }

    public PizzaContext getPizzaContext() {
        
        return this.pizzaContext;
    }

    public PizzaContext setPizzaContext(PizzaContext pizzaContext) {

        return this.pizzaContext = pizzaContext;
    }
}
