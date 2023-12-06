package main.java.org.Nikolaev.oop.Facade;

public class WalkProcess {
    Athlete athlete = new Athlete();
    Walk walk = new Walk();
    SportWatches sportWatches = new SportWatches();

    public void solveProblems() {
        walk.doWalk();
        sportWatches.turnOnPedometer();
        athlete.doWalkBeforeSportWatches(sportWatches);
    }
}
