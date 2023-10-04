import AbstractFactory.FordFactory;
import AbstractFactory.ToyotaFactory;

public class main {
    public static void main(String[] args) {
        ToyotaFactory toyotaFactory = new ToyotaFactory();

        toyotaFactory.createBody();
        toyotaFactory.createTires();

        FordFactory fordFactory = new FordFactory();

        fordFactory.createBody();
        fordFactory.createTires();
    }
}
