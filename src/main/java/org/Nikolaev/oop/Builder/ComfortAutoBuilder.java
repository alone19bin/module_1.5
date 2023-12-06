package main.java.org.Nikolaev.oop.Builder;

public class ComfortAutoBuilder extends AutoBuilderFactory{
    @Override
    void buildModel() {
        auto.setModel("Comfort model");
    }

    @Override
    void buildMachineEquipment() {
        auto.setMachineEquipment(MachineEquipment.MAXIMUM);
    }

    @Override
    void buildPrice() {
        auto.setPrice(55000);
    }
}
