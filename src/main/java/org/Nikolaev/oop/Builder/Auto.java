package main.java.org.Nikolaev.oop.Builder;

public class Auto {
    private String model;
    private MachineEquipment machineEquipment;
    private int price;

    public void setModel(String model) {
        this.model = model;
    }

    public void setMachineEquipment(MachineEquipment machineEquipment) {
        this.machineEquipment = machineEquipment;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "model='" + model + '\'' +
                ", machineEquipment=" + machineEquipment +
                ", price=" + price +
                '}';
    }
}









