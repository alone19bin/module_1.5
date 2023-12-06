package main.java.org.Nikolaev.oop.Decorator;

public class DirectorDecorator implements  Director{
    Director director;

    public DirectorDecorator(Director director) {
        this.director = director;
    }

    @Override
    public String makeJob() {
        return director.makeJob();
    }
}
