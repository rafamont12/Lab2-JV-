package task2;

public class Person {
    public String name;
    public static boolean isHuman;

    public Person(String name) {
        this.name = name;
        System.out.println("Конструктор класу Person");
    }

    static {
        isHuman = true;
        System.out.println("Статичне поле класу Person");
    }
}
