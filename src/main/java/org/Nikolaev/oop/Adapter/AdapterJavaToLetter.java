package main.java.org.Nikolaev.oop.Adapter;

public class AdapterJavaToLetter extends JavaApplication implements Letter{
    @Override
    public void getting() {
        getObject();
    }

    @Override
    public void writing() {
        writeObject();
    }

    @Override
    public void reading() {
        readObject();
    }

    @Override
    public void sending() {
        sendObject();
    }
}
