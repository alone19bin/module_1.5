package main.java.org.Nikolaev.oop.Prototype;

public class AutoFactory {
    Auto auto;

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public AutoFactory(Auto auto) {
        this.auto = auto;
    }

    Auto cloneAuto() {
        return (Auto) auto.copy();
    }
}
