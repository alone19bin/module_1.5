package main.java.org.Nikolaev.oop.Observer;

import java.util.List;

public class Worker  implements Observer{
    String name;

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public void doProcess(List<String> vacansies) {
        System.out.println(name + " ,in company changes in: " + vacansies);
    }
}
