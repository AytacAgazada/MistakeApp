package incorrect_app6;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Simba", 5, "Lion");
        Zookeeper zookeeper = new Zookeeper("Mike", "Feeding");

        animal.describe();
        animal.makeSound();
        System.out.println();

        zookeeper.describe();
        zookeeper.feedAnimals();
    }
}
