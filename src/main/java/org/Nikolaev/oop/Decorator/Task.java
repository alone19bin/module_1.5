package main.java.org.Nikolaev.oop.Decorator;

public class Task {
    public static void main(String[] args) {
        Director director = new ExecutiveProducer(new Producer(new DirectorAssistant()));
        System.out.println(director.makeJob());
    }
}
