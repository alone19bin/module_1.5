package main.java.org.Nikolaev.oop.Visitor;

public class SeniorDesigner implements Designer{
    @Override
    public void create(AutoClass autoClass) {
        System.out.println("Senior can design autoClass");
    }

    @Override
    public void create(Factory factory) {
        System.out.println("Senior can design factory");
    }

    @Override
    public void create(Test test) {
        System.out.println("Senior can design test ");
    }
}
