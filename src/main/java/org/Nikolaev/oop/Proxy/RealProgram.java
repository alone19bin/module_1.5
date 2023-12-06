package main.java.org.Nikolaev.oop.Proxy;

public class RealProgram implements Program{
    private String source;

    public RealProgram(String source) {
        this.source = source;
        load();
    }

    public void load() {
        System.out.println("Loading programm from " + source);
    }

    @Override
    public void run() {
        System.out.println("Running programm " + source);
    }
}
