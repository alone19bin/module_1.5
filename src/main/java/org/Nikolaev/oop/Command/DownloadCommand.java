package main.java.org.Nikolaev.oop.Command;



public class DownloadCommand implements Command{
    File file;
    public DownloadCommand(File file) {
        this.file = file;
    }


    @Override
    public void run() {
        file.download();
    }
}
