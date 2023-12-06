package main.java.org.Nikolaev.oop.State;

public class HumanDay {
    public static void main(String[] args) {
        Activity activity = new Sleep();
        Human human = new Human();

        human.setActivity(activity);

        for (int i = 0; i < 13; i++){
            human.doIt();
            human.changeActivity();
        }
    }



}
