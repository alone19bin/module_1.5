package main.java.org.Nikolaev.oop.Visitor;

public class AutoClass implements AutoElement{
    @Override
    public void beСonstructed(Designer designer) {
        designer.create(this);
    }
}
