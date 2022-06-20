public class PizzaOrderItem {

    private Pizza pizza;
    private Integer amount;

    public PizzaOrderItem(Pizza pizza, Integer amount) {

        this.pizza = pizza;
        this.amount = amount;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {

        if (amount <= this.pizza.getInventory()) {

            this.amount = amount;

        } else {

            StringBuilder sb = new StringBuilder();
            sb.append("The ").append(this.pizza.getName()).append("'s inventory is only")
                    .append(this.pizza.getInventory()).append(" left!");
            new Throwable(sb.toString());
        }

    }

    public Float getItemDiscount() {

        return this.pizza.getPizzaContext.getStrategy().getDiscount(this.amount, this.pizza.getPrice());
    }

    public Float getItemCost() {
        
        return this.pizza.getPrice * this.amount;
    }

    public Float getItemPay() {

        return this.pizza.getItemCost() - this.pizza.getItemDiscount();
    }
}
