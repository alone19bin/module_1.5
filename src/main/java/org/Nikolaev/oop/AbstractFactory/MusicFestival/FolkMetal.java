package main.java.org.Nikolaev.oop.AbstractFactory.MusicFestival;

import main.java.org.Nikolaev.oop.AbstractFactory.Folk;
import main.java.org.Nikolaev.oop.FactoryMethod.Music;

public class FolkMetal implements Folk {
    @Override
    public void playFolk() {
        System.out.println("Folk metal being played at a music festival");
    }
}
