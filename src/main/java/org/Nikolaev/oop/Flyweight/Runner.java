package main.java.org.Nikolaev.oop.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        AutoFactory autoFactory = new AutoFactory();

        List<Auto> autos = new ArrayList<>();

        autos.add(autoFactory.getAutoByModel("Dodge"));
        autos.add(autoFactory.getAutoByModel("Dodge"));
        autos.add(autoFactory.getAutoByModel("Dodge"));
        autos.add(autoFactory.getAutoByModel("Dodge"));
        autos.add(autoFactory.getAutoByModel("Tesla"));
        autos.add(autoFactory.getAutoByModel("Tesla"));
        autos.add(autoFactory.getAutoByModel("Tesla"));
        autos.add(autoFactory.getAutoByModel("Tesla"));
        autos.add(autoFactory.getAutoByModel("Tesla"));

        for (Auto auto: autos) {
            auto.drive();
        }
    }
}
