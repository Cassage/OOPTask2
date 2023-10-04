package AbstractFactory;

public class ToyotaFactory implements CarsFactory {

    @Override
    public Tires createTires() {
        return new ToyotaTires();
    }

    @Override
    public Body createBody() {
        return new ToyotaBody();
    }
}

