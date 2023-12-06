package main.java.org.Nikolaev.oop.Strategy;

public class Dog {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity() {
        activity.doIt();
    }
}
