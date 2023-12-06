package main.java.org.Nikolaev.oop.Visitor;

public class Auto implements AutoElement{
    AutoElement[] autoElements;

    public Auto() {
        this.autoElements = new AutoElement[] {
                new AutoClass(),
                new Factory(),
                new Test()
        };
    }
    @Override
    public void beСonstructed(Designer designer) {
            for(AutoElement autoElement: autoElements) {
                autoElement.beСonstructed(designer);
            }
    }
}
