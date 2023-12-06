package main.java.org.Nikolaev.oop.AbstractFactory.MusicFestival;

import main.java.org.Nikolaev.oop.AbstractFactory.Rock;
import main.java.org.Nikolaev.oop.FactoryMethod.Music;

public class PunkRock implements Rock {
    @Override
    public void playRock() {
        System.out.println("Punk rock metal being played at a music festival");
    }
}
