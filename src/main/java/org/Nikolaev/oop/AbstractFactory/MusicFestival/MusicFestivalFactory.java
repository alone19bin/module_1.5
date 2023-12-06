package main.java.org.Nikolaev.oop.AbstractFactory.MusicFestival;

import main.java.org.Nikolaev.oop.AbstractFactory.Folk;
import main.java.org.Nikolaev.oop.AbstractFactory.MusicFactory;
import main.java.org.Nikolaev.oop.AbstractFactory.Pop;
import main.java.org.Nikolaev.oop.AbstractFactory.Rock;

public class MusicFestivalFactory implements MusicFactory {
    @Override
    public Folk getFolk() {
        return new FolkMetal();
    }

    @Override
    public Pop getPop() {
        return new LatinaPop();
    }

    @Override
    public Rock getRock() {
        return new PunkRock();
    }
}
