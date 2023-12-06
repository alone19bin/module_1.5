package main.java.org.Nikolaev.oop.Adapter;

public class LetterRunner {
    public static void main(String[] args) {
        Letter letter = new AdapterJavaToLetter();

        letter.getting();
        letter.writing();
        letter.reading();
        letter.sending();
    }

}
