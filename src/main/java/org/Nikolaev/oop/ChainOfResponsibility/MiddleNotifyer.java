package main.java.org.Nikolaev.oop.ChainOfResponsibility;

public class MiddleNotifyer extends Notifyer{
    public MiddleNotifyer(int mainPriority) {
        super(mainPriority);
    }
    @Override
    public void runnStream(String runStream) {
        System.out.println("Notifyer using middle stream. " + runStream);
    }
}

