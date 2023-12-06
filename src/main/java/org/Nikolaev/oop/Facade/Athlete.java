package main.java.org.Nikolaev.oop.Facade;

public class Athlete {
    public void doWalkBeforeSportWatches(SportWatches sportWatches) {
        if(sportWatches.isActivePedometer()) {
            System.out.println("Athlete walking");
        }else {
            System.out.println("Athlete is standing");
        }
    }
}
