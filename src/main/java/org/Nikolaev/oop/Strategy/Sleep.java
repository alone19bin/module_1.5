package main.java.org.Nikolaev.oop.Strategy;

public class Sleep implements Activity{
    @Override
    public void doIt() {
        System.out.println("Sleeping");
    }
}
