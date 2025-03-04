package incorrect_app6;

public class Zookeeper {
    private LivingBeing livingBeing;
    private String responsibility;

    public Zookeeper(String name, String responsibility) {
        this.livingBeing = new LivingBeing(name, 30, "Zookeeper");
        this.responsibility = responsibility;
    }

    public void describe() {
        livingBeing.describe();
        System.out.println("My responsibility is " + responsibility + ".");
    }

    public void feedAnimals() {
        System.out.println(livingBeing.getName() + " is feeding the animals.");
    }
}
