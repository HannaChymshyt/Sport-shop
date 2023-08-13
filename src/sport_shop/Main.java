package sport_shop;

public class Main {

    public static void main(String[] args) {

        OrderBuilder orderBuilder = new OrderBuilder();

        Order orderA = orderBuilder.orderA();
        System.out.println("Order A");
        orderA.showItems();
        System.out.println("Total Cost: " + orderA.getCost());

        Order orderB = orderBuilder.orderB();
        System.out.println("\nOrder B");
        orderB.showItems();
        System.out.println("Total Cost: " + orderB.getCost());
    }

}
