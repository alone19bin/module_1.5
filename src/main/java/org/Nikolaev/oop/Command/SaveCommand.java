package main.java.org.Nikolaev.oop.Command;

public class SaveCommand implements Command{
    File file;

    public SaveCommand(File file) {
        this.file = file;
    }

    @Override
    public void run() {
        file.save();
    }
}
