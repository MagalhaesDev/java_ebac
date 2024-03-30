interface Car {
    void assemble();
}

class Sedan implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling Sedan Car");
    }
}

class SUV implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling SUV Car");
    }
}

class Hatchback implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling Hatchback Car");
    }
}

// Interface para as fábricas concretas
interface CarFactory {
    Car createCar();
}

// Concrete Factory 1
class SedanFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Sedan();
    }
}

class SUVFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new SUV();
    }
}

class HatchbackFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Hatchback();
    }
}

class CarProducer {
    CarFactory factory;

    public CarProducer(CarFactory factory) {
        this.factory = factory;
    }

    public Car produceCar() {
        return factory.createCar();
    }
}

public class Main {
    public static void main(String[] args) {
        CarProducer sedanProducer = new CarProducer(new SedanFactory());
        Car sedan = sedanProducer.produceCar();
        sedan.assemble();

        CarProducer suvProducer = new CarProducer(new SUVFactory());
        Car suv = suvProducer.produceCar();
        suv.assemble();

        CarProducer hatchbackProducer = new CarProducer(new HatchbackFactory());
        Car hatchback = hatchbackProducer.produceCar();
        hatchback.assemble();
    }
}
