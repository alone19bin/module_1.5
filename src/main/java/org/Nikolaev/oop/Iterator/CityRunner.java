package main.java.org.Nikolaev.oop.Iterator;

public class CityRunner {
    public static void main(String[] args) {
        String[] districts = {"Central", "Eastern", "Southern", "Western"};

        City city = new City("NY", districts);

        Iterator iterator = city.getIterator();
        System.out.println("City: " + city.getName());
        System.out.println("districts: ");

        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString() + " ");
        }
    }
}
