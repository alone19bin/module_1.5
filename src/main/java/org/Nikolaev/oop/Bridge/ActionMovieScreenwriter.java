package main.java.org.Nikolaev.oop.Bridge;

public class ActionMovieScreenwriter implements Screenwriter{
    @Override
    public void writeScenario() {
        System.out.println("The screenwriter of the action movie is writing the script");
    }
}
