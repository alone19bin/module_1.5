package main.java.org.Nikolaev.oop.Strategy;

public class DogRunner {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.setActivity(new Sleep());
        dog.executeActivity();

        dog.setActivity(new Bark());
        dog.executeActivity();

        dog.setActivity(new Bite());
        dog.executeActivity();

        dog.setActivity(new Run());
        dog.executeActivity();

        dog.setActivity(new Sleep());
        dog.executeActivity();
    }

}
