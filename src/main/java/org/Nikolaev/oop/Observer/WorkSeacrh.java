package main.java.org.Nikolaev.oop.Observer;

public class WorkSeacrh {
    public static void main(String[] args) {
        ActorsJobSite actorsJobSite = new ActorsJobSite();

        actorsJobSite.addVacancy("Art Director");
        actorsJobSite.addVacancy("Editor");

        Observer worker1 = new Worker("Ivan Ivanov");
        Observer worker2 = new Worker("Petr Petrov");

        actorsJobSite.addObserver(worker1);
        actorsJobSite.addObserver(worker2);

        actorsJobSite.addVacancy("Director");

        actorsJobSite.removeVacancy("Editor");
    }
}
