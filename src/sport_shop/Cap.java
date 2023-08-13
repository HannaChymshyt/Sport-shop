package sport_shop;

public abstract class Cap implements Item{
    @Override
    public Manufacturer producer() {
        return new CapManufacturer();
    }

    @Override
    public abstract float price();
}
