package sport_shop;

public class BlackCap extends Cap{
    @Override
    public float price() {
        return 15.0f;
    }

    @Override
    public String name() {
        return "Cap";
    }
    @Override
    public String color() {
        return "Black";
    }
}
