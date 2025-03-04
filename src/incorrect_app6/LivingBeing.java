package incorrect_app6;

public class LivingBeing {
    private String name;
    private int age;
    private String type;

    public LivingBeing(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public void describe() {
        System.out.println("Hello, I am " + name + ". I am " + age + " years old.");
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
