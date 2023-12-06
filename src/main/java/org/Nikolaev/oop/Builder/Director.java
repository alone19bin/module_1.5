package main.java.org.Nikolaev.oop.Builder;

public class Director {
    AutoBuilderFactory factory;

    public void setFactory(AutoBuilderFactory factory) {
        this.factory = factory;
    }

    Auto factoryAuto() {
        factory.createAuto();
        factory.buildModel();
        factory.buildMachineEquipment();
        factory.buildPrice();

        Auto auto = factory.getAuto();
        return auto;
    }
}
