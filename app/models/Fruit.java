package models;

import java.util.ArrayList;
import java.util.List;

public class Fruit {
    public String id;
    public String name;
    public String sum;
    private static List<Fruit> fruits;
    static {
        fruits = new ArrayList<Fruit>();
        fruits.add(new Fruit("1", "Apples","464674674637"));
        fruits.add(new Fruit("2", "Oranges","7747567465"));
        fruits.add(new Fruit("3", "Pineapples","968685757888"));
        fruits.add(new Fruit("4", "Kiwi", "98545453400"));
        fruits.add(new Fruit("5", "Strawberry","324353426"));
    }
    public Fruit() {
    }
    public Fruit(String id, String name, String sum) {
        this.id = id;
        this.name = name;
        this.sum = sum;
    }
    public String toString() {

        return String.format("%s - %s", id, name, sum);
    }
    public static List<Fruit> findAll() {

        return new ArrayList<Fruit>(fruits);
    }
     public static List<Fruit> findByName(String term) {
        final List<Fruit> results = new ArrayList<Fruit>();
        for (Fruit candidate : fruits) {
            if (candidate.name.toLowerCase().contains(term.toLowerCase())) {
                results.add(candidate);
            }
        }
        return results;
    }
   }
