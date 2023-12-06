package main.java.org.Nikolaev.oop.Visitor;

public class Factory implements AutoElement{
    @Override
    public void beСonstructed(Designer designer) {
        designer.create(this);
    }
}
