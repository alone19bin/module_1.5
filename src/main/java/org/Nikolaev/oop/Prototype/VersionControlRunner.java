package main.java.org.Nikolaev.oop.Prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Auto master = new Auto(1, "Honda", "Red");

        System.out.println(master);

        AutoFactory autoFactory = new AutoFactory(master);
        Auto masterClone = autoFactory.cloneAuto();

        System.out.println("\n_______________________\n");
        System.out.println(masterClone);
    }
}
