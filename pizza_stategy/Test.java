public class Test {
    public static void main(String[] args) {

        Pizza hawaiian = new Pizza("Hawaiian Pizza", 15, (float)7.99);
        Pizza meatloaf = new Pizza("Meatloaf Pizza", 20, (float)13.99);
        Pizza bbqChicken = new Pizza("BBQ Chicken Pizza", 13, (float)12.99);
        Pizza pepperoni = new Pizza("Pepperoni Pizza", 12, (float)6.99);
        Pizza veggie = new Pizza("Veggie Pizza", 14, (float)5.99);

        PizzaOrderItem hawaiian_item = new PizzaOrderItem(hawaiian, 2);
    }
}
