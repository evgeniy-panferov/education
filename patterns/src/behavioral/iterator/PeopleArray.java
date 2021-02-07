package behavioral.iterator;

public class PeopleArray implements Container {

    String[] peoples = {"Max", "Peter", "John"};

    @Override
    public Iterator getIterator() {
        return new PeopleIterator();
    }

    private class PeopleIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            return index < peoples.length;
        }

        @Override
        public Object next() {
            return peoples[index++];
        }
    }
}
