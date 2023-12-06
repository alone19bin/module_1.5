package main.java.org.Nikolaev.oop.Visitor;

public class AssistantDesigner implements Designer{
    @Override
    public void create(AutoClass autoClass) {
        System.out.println("Assistant can not design autoClass");
    }

    @Override
    public void create(Factory factory) {
        System.out.println("Assistant can not design factory");
    }

    @Override
    public void create(Test test) {
        System.out.println("Assistant can not design test");
    }
}
