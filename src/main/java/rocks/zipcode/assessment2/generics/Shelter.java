package rocks.zipcode.assessment2.generics;


import java.lang.reflect.Array;
import java.util.Iterator;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<T> implements Iterable<String> {
    Shelter<T> test;
    public Shelter() { }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return 0;
    }

    public void add(Object object) {

    }

    public Boolean contains(Object object) {
        return test.contains(object);
    }

    public void remove(Object object) {

    }

    public Object get(Integer index) {
        return null;
    }

    public Integer getIndexOf(Object ageable) {

        return 0;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}