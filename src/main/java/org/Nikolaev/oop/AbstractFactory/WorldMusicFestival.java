package main.java.org.Nikolaev.oop.AbstractFactory;

import main.java.org.Nikolaev.oop.AbstractFactory.MusicFestival.MusicFestivalFactory;

public class WorldMusicFestival {
    public static void main(String[] args) {
        MusicFactory musicFactory = new MusicFestivalFactory();
        Folk folk = musicFactory.getFolk();
        Pop pop = musicFactory.getPop();
        Rock rock = musicFactory.getRock();

        System.out.println("Music festival is starting");
        folk.playFolk();
        pop.playPop();
        rock.playRock();
    }
}
