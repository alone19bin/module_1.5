package main.java.org.Nikolaev.oop.FactoryMethod;

public class StartFactoryMethod {
    public static void main(String[] args) {
        MusicFactory musicFactory = createMusicByGenre("sdsdsd");
        Music music = musicFactory.createMusic();
        music.playMusic();
    }
    static MusicFactory createMusicByGenre(String genre) {
        if (genre.equalsIgnoreCase("Rock")) {
            return new RockMusicFactory();
        } else if (genre.equalsIgnoreCase("Pop")) {
            return new PopMusicFactory();
        } else if (genre.equalsIgnoreCase("Folk")) {
            return new FolkMusicFactory();
        } else {
            throw new RuntimeException((genre + " is unknown genre"));
        }
    }
}