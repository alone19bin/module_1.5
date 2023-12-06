package main.java.org.Nikolaev.oop.Composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Screenwriter> screenwriters = new ArrayList<Screenwriter>();

    public void addScreenwriter(Screenwriter screenwriter) {
        screenwriters.add(screenwriter);
    }
    public void deleteScreenwriter(Screenwriter screenwriter) {
        screenwriters.remove(screenwriter);
    }
    public void createProject() {
        System.out.println("Team writes writes the script");
        for (Screenwriter screenwriter: screenwriters) {
            screenwriter.writeScenario();
        }
    }
}
