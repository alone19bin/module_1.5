package main.java.org.Nikolaev.oop.Composite;




public class Project {
    public static void main(String[] args) {
        Team team = new Team();


        Screenwriter scienceFictionScreenwriter1 = new ScienceFictionScreenwriter();

        Screenwriter scienceFictionScreenwriter2 = new ScienceFictionScreenwriter();

        Screenwriter actionMovieScreenwriter = new ActionMovieScreenwriter();

        team.addScreenwriter(scienceFictionScreenwriter1);
        team.addScreenwriter(scienceFictionScreenwriter2);
        team.addScreenwriter(actionMovieScreenwriter);

        team.createProject();

    }
}
