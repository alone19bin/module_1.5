package main.java.org.Nikolaev.oop.Observer;



import java.util.ArrayList;
import java.util.List;

public class ActorsJobSite implements Observed{
    List<String> vacansies = new ArrayList<>();
    List<Observer> workers = new ArrayList<>();

    public void addVacancy (String vacancy) {
        this.vacansies.add(vacancy);
        notifyObserver();
    }
    public void removeVacancy (String vacancy) {
        this.vacansies.remove(vacancy);
        notifyObserver();
    }
    @Override
    public void addObserver(Observer observer) {
        this.workers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.workers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: workers) {
            observer.doProcess(this.vacansies);
        }
    }
}
