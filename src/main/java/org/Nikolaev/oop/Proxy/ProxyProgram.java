package main.java.org.Nikolaev.oop.Proxy;

public class ProxyProgram implements Program{
    private String source;
    private RealProgram realProgram;

    public ProxyProgram(String source) {
        this.source = source;
    }

    @Override
    public void run() {
        if(realProgram == null) {
            realProgram = new RealProgram(source);
        }
        realProgram.run();
    }
}
