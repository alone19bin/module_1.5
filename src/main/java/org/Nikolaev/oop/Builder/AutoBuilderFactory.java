package main.java.org.Nikolaev.oop.Builder;

public abstract class AutoBuilderFactory {
    Auto auto;

    void createAuto () {
        auto = new Auto();
    }

    abstract void buildModel();
    abstract void buildMachineEquipment();
    abstract void buildPrice();

    Auto getAuto() {
        return auto;
    }

}
