package AbstractFactory;

public class FordFactory implements CarsFactory {

    @Override
    public Tires createTires() {
        return new FordTires();
    }

    @Override
    public Body createBody() {
        return new FordBody();
    }
}
