package main.java.org.Nikolaev.oop.ChainOfResponsibility;

public abstract class Notifyer {
    private int mainPriority;
    private Notifyer nextNotifyer;

    public Notifyer(int mainPriority) {
        this.mainPriority = mainPriority;
    }
    public void setNextNotifyer(Notifyer nextNotifyer) {
        this.nextNotifyer = nextNotifyer;
    }

    public void notifyerManager(String runStream, int anotherPriority) {
        if(anotherPriority >= mainPriority) {
            runnStream(runStream);
        }
        if (nextNotifyer != null) {
            nextNotifyer.notifyerManager(runStream, anotherPriority);
        }
    }
    public abstract void runnStream(String runStream);
}
