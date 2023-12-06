package main.java.org.Nikolaev.oop.Bridge;

public class Limitless extends Film{
    protected Limitless(Screenwriter screenwriter) {
        super(screenwriter);
    }

    @Override
    public void setScreenwriter() {
        System.out.println("Limitless in the process of writing the script");
        screenwriter.writeScenario();
    }
}
