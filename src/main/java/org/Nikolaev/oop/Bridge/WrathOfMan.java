package main.java.org.Nikolaev.oop.Bridge;

public class WrathOfMan extends Film{


    protected WrathOfMan(Screenwriter screenwriter) {
        super(screenwriter);
    }

    @Override
    public void setScreenwriter() {
        System.out.println("Wrath Of Man in the process of writing the script");
        screenwriter.writeScenario();
    }
}
