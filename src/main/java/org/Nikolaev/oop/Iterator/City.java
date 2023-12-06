package main.java.org.Nikolaev.oop.Iterator;

public class City implements Collection{
    private String name;
    private String[] districts;

    public City(String name, String[] districts) {
        this.name = name;
        this.districts = districts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getDistricts() {
        return districts;
    }

    public void setDistricts(String[] districts) {
        this.districts = districts;
    }

    @Override
    public Iterator getIterator() {
        return new DistrictIterator();
    }

    private class DistrictIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if(index < districts.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return districts[index++];
        }
    }
}
