package main.java.org.Nikolaev.oop.AbstractFactory.MusicPlayList;

import main.java.org.Nikolaev.oop.AbstractFactory.Folk;
import main.java.org.Nikolaev.oop.AbstractFactory.MusicFactory;
import main.java.org.Nikolaev.oop.AbstractFactory.Pop;
import main.java.org.Nikolaev.oop.AbstractFactory.Rock;

public class MusicPlayList implements MusicFactory {
    @Override
    public Folk getFolk() {
        return new NeoFolk();
    }

    @Override
    public Pop getPop() {
        return new PopDisco();
    }

    @Override
    public Rock getRock() {
        return new HardRock();
    }
}
