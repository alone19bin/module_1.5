package main.java.org.Nikolaev.oop.Decorator;

public class ExecutiveProducer extends DirectorDecorator{
    public ExecutiveProducer(Director director) {
        super(director);
    }
    public String checksReports() {
        return (" checks reports subordinates.");
    }
    @Override
    public String makeJob() {
        return super.makeJob() + checksReports();
    }
}
