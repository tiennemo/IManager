package advance.dev;

public class Main {

	    public static void main(String[] args) {
	        FruitManager manager = new FruitManager();

	        Fruit fruit1 = new Fruit(100, "Apple", 1.99);
	        Fruit fruit2 = new Fruit(150, "Banana", 0.99);
	        Fruit fruit3 = new Fruit(200, "Orange", 1.49);

	        manager.addFruit(fruit1);
	        manager.addFruit(fruit2);
	        manager.addFruit(fruit3);

	        System.out.println("All fruits:");
	        for (Fruit fruit : manager.getAllFruits()) {
	            System.out.println(fruit);
	        }

	        manager.sortFruits();

	        System.out.println("Sorted fruits:");
	        for (Fruit fruit : manager.getAllFruits()) {
	            System.out.println(fruit);
	        }
	    }
}
