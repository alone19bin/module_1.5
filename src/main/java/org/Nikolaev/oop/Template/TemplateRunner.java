package main.java.org.Nikolaev.oop.Template;

public class TemplateRunner {
    public static void main(String[] args) {
        Template firstTemplate = new FirstTemplate();
        Template secondTemplate = new SecondTemplate();

        firstTemplate.showTemplate();

        System.out.println("______________________");

        secondTemplate.showTemplate();



    }
}
