package main.java.org.Nikolaev.oop.Strategy;

public class Bark implements Activity{
    @Override
    public void doIt() {
        System.out.println("Barking");
    }
}
