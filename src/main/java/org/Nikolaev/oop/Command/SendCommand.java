package main.java.org.Nikolaev.oop.Command;

public class SendCommand implements Command{
    File file;

    public SendCommand(File file) {
        this.file = file;
    }

    @Override
    public void run() {
        file.save();
    }
}
