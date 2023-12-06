package main.java.org.Nikolaev.oop.Builder;

public class FactoryAutoRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setFactory((new StandardAutoBuilder()));
        Auto auto = director.factoryAuto();

        System.out.println(auto);
    }
}
