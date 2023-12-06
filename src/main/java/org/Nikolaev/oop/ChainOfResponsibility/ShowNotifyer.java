package main.java.org.Nikolaev.oop.ChainOfResponsibility;

public class ShowNotifyer {
    public static void main(String[] args) {
        Notifyer notifyer1 = new LowNotifyer(Priority.LowLevel);
        Notifyer notifyer2 = new MiddleNotifyer(Priority.MiddleLevel);
        Notifyer notifyer3 = new HighNotifyer(Priority.HighLevel);

        notifyer1.setNextNotifyer(notifyer2);
        notifyer2.setNextNotifyer(notifyer3);

        notifyer1.notifyerManager("Low priority now", Priority.LowLevel);
       notifyer1.notifyerManager("Priority has become higher", Priority.MiddleLevel);
        notifyer1.notifyerManager("Priority has become higher", Priority.HighLevel);
    }
}
