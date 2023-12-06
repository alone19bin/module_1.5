package main.java.org.Nikolaev.oop.FactoryMethod;

public class FolkMusicFactory implements MusicFactory {
    @Override
    public Music createMusic() {
        return new FolkMusic();
    }
}
