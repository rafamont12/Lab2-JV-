package Task1;

public class Animal {
    public String name;
    public double speed;

    public Animal(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    public void run() {
        System.out.println(name + " біжить зі швидкістю " + speed);
    }

    public boolean eat(Food food) {
        return true;
    }
}
