package main.java.org.Nikolaev.oop.Command;

public class FileRunner {
    public static void main(String[] args) {
        File file = new File();

        User user = new User
                (       new DownloadCommand(file),
                        new EditCommand(file),
                        new SaveCommand(file),
                        new SendCommand(file));


        user.downloadFile();
        user.editFile();
        user.saveFile();
        user.sendFile();
    }

}
