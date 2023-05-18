package advance.dev;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.List;

	class Fruit {
	    private int weight;
	    private String name;
	    private double price;

	    public Fruit(int weight, String name, double price) {
	        this.weight = weight;
	        this.name = name;
	        this.price = price;
	    }

	    public int getWeight() {
	        return weight;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public String toString() {
	        return "Name: " + name + ", Weight: " + weight + ", Price: " + price;
	    }
	}

	interface IManager {
	    void addFruit(Fruit fruit);
	    void removeFruit(Fruit fruit);
	    void updateFruit(int index, Fruit newFruit);
	    List<Fruit> getAllFruits();
	    void sortFruits();
	}

	class FruitManager implements IManager {
	    private List<Fruit> fruits;

	    public FruitManager() {
	        fruits = new ArrayList<>();
	    }

	    public void addFruit(Fruit fruit) {
	        fruits.add(fruit);
	    }

	    public void removeFruit(Fruit fruit) {
	        fruits.remove(fruit);
	    }

	    public void updateFruit(int index, Fruit newFruit) {
	        fruits.set(index, newFruit);
	    }

	    public List<Fruit> getAllFruits() {
	        return fruits;
	    }

	    public void sortFruits() {
	        Collections.sort(fruits, Comparator.comparing(Fruit::getName));
	    }
	}

	
	

