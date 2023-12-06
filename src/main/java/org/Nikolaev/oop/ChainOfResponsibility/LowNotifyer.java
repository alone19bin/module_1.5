package main.java.org.Nikolaev.oop.ChainOfResponsibility;

public class LowNotifyer extends Notifyer{
    public LowNotifyer(int mainPriority) {
        super(mainPriority);
    }
    @Override
    public void runnStream(String runStream) {
        System.out.println("Notifyer using low stream. " + runStream);
    }
}

