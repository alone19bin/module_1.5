package main.java.org.Nikolaev.oop.AbstractFactory.MusicPlayList;

import main.java.org.Nikolaev.oop.AbstractFactory.Folk;

public class NeoFolk implements Folk {
    @Override
    public void playFolk() {
        System.out.println("Neo folk reproduced in music player");
    }
}
