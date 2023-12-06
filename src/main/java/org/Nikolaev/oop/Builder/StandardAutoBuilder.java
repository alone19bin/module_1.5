package main.java.org.Nikolaev.oop.Builder;

public class StandardAutoBuilder extends AutoBuilderFactory {
    @Override
    void buildModel() {
        auto.setModel("Standard model");
    }

    @Override
    void buildMachineEquipment() {
        auto.setMachineEquipment(MachineEquipment.MINIMUM);
    }

    @Override
    void buildPrice() {
        auto.setPrice(40000);
    }
}
