package main.java.org.Nikolaev.oop.ChainOfResponsibility;

public class HighNotifyer extends Notifyer{
    public HighNotifyer(int mainPriority) {
        super(mainPriority);
    }
    @Override
    public void runnStream(String runStream) {
        System.out.println("Notifyer using high stream. " + runStream);
    }
}

