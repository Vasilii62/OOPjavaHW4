package Fruit.gb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box<T extends Fruit> implements Iterable<T> {

    public List<T> fruits = new ArrayList<>();

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public void delete(T fruit) {
        fruits.clear();
    }

    public int getWeight() {// Сумма

        int boxWeight = 0;
        for (T fruit : fruits) {
            boxWeight += fruit.getWeight();
        }
        return boxWeight;
    }

    public void replaceFruitsToAnotherBox(Box<T> to) {
        for (T fruit : fruits) {
            to.add(fruit);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return fruits.iterator();
    }

}
