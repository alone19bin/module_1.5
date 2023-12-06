package main.java.org.Nikolaev.oop.Command;

public class User {
    Command download;
    Command edit;
    Command save;
    Command send;

    public User(Command download, Command edit, Command save, Command send) {
        this.download = download;
        this.edit = edit;
        this.save = save;
        this.send = send;
    }

    public void downloadFile() {
        download.run();
    }
    public void editFile() {
        edit.run();
    }
    public void saveFile() {
        save.run();
    }
    public void sendFile() {
        send.run();
    }
}
