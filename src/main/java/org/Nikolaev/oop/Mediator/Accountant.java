package main.java.org.Nikolaev.oop.Mediator;

public class Accountant implements Employee{
    OneCProgramm oneCProgramm;
    String name;

    public Accountant(OneCProgramm oneCProgramm, String name) {
        this.oneCProgramm = oneCProgramm;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.name + " get massage:  " + message);
    }

    @Override
    public void sendMessage(String message) {
        oneCProgramm.sendMassage(message, this);
    }
}
