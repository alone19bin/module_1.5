package main.java.org.Nikolaev.oop.Template;

public abstract class Template {
    public void showTemplate() {
        System.out.println("Beginning");
        showAll();
        System.out.println("The end");
    }
    public abstract void showAll();
}
