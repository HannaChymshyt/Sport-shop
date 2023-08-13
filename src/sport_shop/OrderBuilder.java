package sport_shop;

public class OrderBuilder {

    public Order orderA() {
        Order order = new Order();
        order.addItem(new RedShirt());
        order.addItem(new WhiteCap());
        return order;
    }

    public Order orderB() {
        Order order = new Order();
        order.addItem(new BlueShirt());
        order.addItem(new BlackCap());
        return order;
    }

}
