package main.java.org.Nikolaev.oop.Visitor;

public interface Designer {
    public void create(AutoClass autoClass);
    public void create(Factory factory);
    public void create(Test test);

}
