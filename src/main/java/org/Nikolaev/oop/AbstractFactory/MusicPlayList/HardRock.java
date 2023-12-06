package main.java.org.Nikolaev.oop.AbstractFactory.MusicPlayList;

import main.java.org.Nikolaev.oop.AbstractFactory.Rock;

public class HardRock implements Rock {
    @Override
    public void playRock() {
        System.out.println("Hard rock reproduced in music player");
    }
}
