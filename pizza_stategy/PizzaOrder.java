import java.util.List;

public class PizzaOrder {

    private List<PizzaOrderItem> pizzaOrderItems;

    public List<PizzaOrderItem> getPizzaOrderItems() {
        return pizzaOrderItems;
    }

    public void setPizzaOrderItems(List<PizzaOrderItem> pizzaOrderItems) {
        this.pizzaOrderItems = pizzaOrderItems;
    }

    public Float getTotalPercentOffDiscount() {

        Float totalDiscount = 0f;

        for (PizzaOrderItem item: pizzaOrderItems) {

            totalDiscount += item.getPizza()..getDiscountedTotal(item.getAmount(), item.getPizzaContext().getDiscountedTotal(amount, price));
        }

        return totalDiscount;        

    }

    public Float getTotalCost() {
        
        Float totalCost = 0f;

        for (PizzaOrderItem item: pizzaOrderItems) {

            totalCost += item.getAmount() * item.getPizza().getPrice();
        }

        return totalCost;
    }

    public Float getTotalPay() {

        return this.getTotalCost() - this.getTotalPercentOffDiscount();
    }

}
