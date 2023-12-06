package main.java.org.Nikolaev.oop.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class AutoFactory {
    private static final Map<String, Auto> autos = new HashMap<>();

    public Auto getAutoByModel(String model) {
        Auto auto = autos.get(model);

        if(auto == null) {
            switch (model) {
                case "Dodge":
                    System.out.println("Buying dodge");
                    auto = new Dodge();
                    break;
                case "Tesla":
                    System.out.println("Buying tesla");
                    auto = new Tesla();
            }
            autos.put(model, auto);
        }
        return auto;
    }
}
