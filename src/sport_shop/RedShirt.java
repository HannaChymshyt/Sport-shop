package sport_shop;

public class RedShirt extends Shirt{

    @Override
    public float price() {
        return 55.0f;
    }

    @Override
    public String name() {
        return "T-shirt";
    }
    @Override
    public String color() {
        return "Red";
    }

}
