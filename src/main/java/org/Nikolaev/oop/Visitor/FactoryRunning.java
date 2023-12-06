package main.java.org.Nikolaev.oop.Visitor;

public class FactoryRunning {
    public static void main(String[] args) {
        Auto auto = new Auto();

        Designer assistant = new AssistantDesigner();
        Designer senior = new SeniorDesigner();

        System.out.println("Assistant working");
        auto.beСonstructed(assistant);

        System.out.println("_________________");

        System.out.println("Senior working");
        auto.beСonstructed(senior);
    }



}
