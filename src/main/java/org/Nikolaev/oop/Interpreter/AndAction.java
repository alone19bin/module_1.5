package main.java.org.Nikolaev.oop.Interpreter;

public class AndAction implements Action {
    private Action action1;
    private Action action2;
    public AndAction(Action action1, Action action2) {
        this.action1 = action1;
        this.action2 = action2;
    }

    @Override
    public boolean interpret(String context) {
        return action1.interpret(context) && action2.interpret(context);
    }
}
