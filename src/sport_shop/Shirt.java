package sport_shop;

public abstract class Shirt implements Item{

    @Override
    public Manufacturer producer() {
        return new ShirtManufacturer();
    }

    @Override
    public abstract float price();

}
