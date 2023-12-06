package main.java.org.Nikolaev.oop.Bridge;

public class FilmCreator {
    public static void main(String[] args) {
        Film [] films = {new WrathOfMan(new ActionMovieScreenwriter()),
                        new Limitless(new ScienceFictionScreenwriter())};

        for(Film film: films) {
            film.setScreenwriter();
        }
    }
}
