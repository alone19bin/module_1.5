package main.java.org.Nikolaev.oop.Facade;

public class SportWatches {
    private boolean activePedometer;

    public boolean isActivePedometer() {
        return activePedometer;
    }
    public void turnOnPedometer() {
        System.out.println("Pedometer is active");
        activePedometer = true;
    }

    public void turnOffPedometer() {
        System.out.println("Pedometer is not active");
        activePedometer = false;
    }
}
