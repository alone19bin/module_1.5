package main.java.org.Nikolaev.oop.Visitor;

public class Test implements AutoElement{
    @Override
    public void beСonstructed(Designer designer) {
        designer.create(this);
    }
}
