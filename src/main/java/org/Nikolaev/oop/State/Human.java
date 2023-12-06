package main.java.org.Nikolaev.oop.State;

import main.java.org.Nikolaev.oop.Command.EditCommand;

public class Human {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
    public void changeActivity() {
        if (activity instanceof Sleep){
            setActivity(new Education());
        } else if (activity instanceof Education){
            setActivity(new Eat());
        }else if (activity instanceof Eat) {
            setActivity(new Walk());
        }else if(activity instanceof Walk){
            setActivity(new Sleep());
        }
    }
    public void doIt() {
        activity.doIt();
    }
}
