package main.java.org.Nikolaev.oop.FactoryMethod;

public class RockMusicFactory implements MusicFactory {
    @Override
    public Music createMusic() {
        return new RockMusic();
    }
}
