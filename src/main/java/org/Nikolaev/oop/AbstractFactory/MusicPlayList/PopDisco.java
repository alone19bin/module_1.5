package main.java.org.Nikolaev.oop.AbstractFactory.MusicPlayList;

import main.java.org.Nikolaev.oop.AbstractFactory.Pop;

public class PopDisco implements Pop {
    @Override
    public void playPop() {
        System.out.println("Pop disco reproduced in music player");
    }
}
