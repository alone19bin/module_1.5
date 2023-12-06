package main.java.org.Nikolaev.oop.Command;

public class EditCommand implements Command {
    File file;

    public EditCommand(File file) {
        this.file = file;
    }

    @Override
    public void run() {
        file.edit();
    }
}
