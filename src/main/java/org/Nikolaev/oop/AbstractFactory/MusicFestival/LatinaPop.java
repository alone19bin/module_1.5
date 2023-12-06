package main.java.org.Nikolaev.oop.AbstractFactory.MusicFestival;

import main.java.org.Nikolaev.oop.AbstractFactory.Pop;
import main.java.org.Nikolaev.oop.FactoryMethod.Music;

public class LatinaPop implements Pop {
    @Override
    public void playPop() {
        System.out.println("Pop being played at a music festival");
    }
}
