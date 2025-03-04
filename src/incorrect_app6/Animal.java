package incorrect_app6;

public class Animal {
    private LivingBeing livingBeing;
    private String species;

    public Animal(String name, int age, String species) {
        this.livingBeing = new LivingBeing(name, age, "Animal");
        this.species = species;
    }

    public void describe() {
        livingBeing.describe();
        System.out.println("I am a " + species + ".");
    }

    public void makeSound() {
        System.out.println(livingBeing.getName() + " is roaring.");
    }
}
