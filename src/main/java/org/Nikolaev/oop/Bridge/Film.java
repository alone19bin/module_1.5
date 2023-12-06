package main.java.org.Nikolaev.oop.Bridge;

public abstract class Film {
    protected Screenwriter screenwriter;

    protected Film(Screenwriter screenwriter) {
        this.screenwriter = screenwriter;
    }

    public abstract void setScreenwriter();
}
