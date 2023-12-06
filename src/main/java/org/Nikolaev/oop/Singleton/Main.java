package main.java.org.Nikolaev.oop.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1.toString());

        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2.toString());
    }
}
