package main.java.org.Nikolaev.oop.Interpreter;

import main.java.org.Nikolaev.oop.Command.File;

public class ActionRunner {
    public static void main(String[] args) {
        Action flyingAction = getFlyingAction();
        Action runningAction = getRunningAction();

        System.out.println("If object can fly: " + flyingAction.interpret("Flying"));
        System.out.println("If object can run: " + runningAction.interpret("Running"));
    }

    public static Action getFlyingAction() {
        Action move = new TerAction("Move");
        Action fly = new TerAction("Fly");
        return new OrAction(move, fly);
    }
    public static Action getRunningAction() {
        Action move = new TerAction("Move");
        Action run = new TerAction("Run");
        return new OrAction(move, run);
    }


}
