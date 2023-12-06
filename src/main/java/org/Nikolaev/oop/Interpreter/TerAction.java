package main.java.org.Nikolaev.oop.Interpreter;

public class TerAction implements Action{
    private String massage;
    public TerAction(String massage) {
        this.massage = massage;
    }


    @Override
    public boolean interpret(String context) {
        if(context.contains(massage)){
            return true;
        }
        return false;
    }
}
