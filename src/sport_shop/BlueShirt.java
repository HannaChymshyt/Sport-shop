package sport_shop;

public class BlueShirt extends Shirt{
    @Override
    public float price() {
        return 45.0f;
    }

    @Override
    public String name() {
        return "T-shirt";
    }
    @Override
    public String color() {
        return "Blue";
    }
}
