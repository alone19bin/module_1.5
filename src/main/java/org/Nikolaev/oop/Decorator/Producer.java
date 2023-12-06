package main.java.org.Nikolaev.oop.Decorator;

public class Producer extends DirectorDecorator{
    public Producer(Director director) {
        super(director);
    }

    public String makeReport() {
        return " make a report.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeReport();
    }
}
