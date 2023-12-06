package main.java.org.Nikolaev.oop.FactoryMethod;

public class PopMusicFactory implements MusicFactory {
    @Override
    public Music createMusic() {
        return new PopMusic();
    }
}
