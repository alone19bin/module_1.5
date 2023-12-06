package main.java.org.Nikolaev.oop.AbstractFactory;

import main.java.org.Nikolaev.oop.AbstractFactory.MusicPlayList.HardRock;
import main.java.org.Nikolaev.oop.AbstractFactory.MusicPlayList.MusicPlayList;

public class MusicPlayer {
    public static void main(String[] args) {
        MusicFactory musicFactory = new MusicPlayList();
        Rock rock = musicFactory.getRock();
        Pop pop = musicFactory.getPop();
        Folk folk = musicFactory.getFolk();

        System.out.println("Music player is starting");
        rock.playRock();
        pop.playPop();
        folk.playFolk();
    }
}
