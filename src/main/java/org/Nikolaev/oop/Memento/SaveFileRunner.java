package main.java.org.Nikolaev.oop.Memento;

public class SaveFileRunner {
    public static void main(String[] args) throws InterruptedException {
        File file = new File();
        HardDiskSource hardDisk = new HardDiskSource();

        System.out.println("Creat new file, version 1");
        file.setVersionAndDate("version 1");

        System.out.println(file);

        System.out.println("Save new file to hard disk");
        hardDisk.setSave(file.save());

        System.out.println("Update fiel to version 2");

        System.out.println("Write information");
        Thread.sleep(3000);
        file.setVersionAndDate("Version 2");

        System.out.println(file);

        System.out.println("Error");

        System.out.println("Open file version 1");
        file.load(hardDisk.getSave());

        System.out.println("File after opening");
        System.out.println(file);


    }



}
