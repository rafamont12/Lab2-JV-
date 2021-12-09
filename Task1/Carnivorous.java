package task1;

public class Carnivorous extends Animal {
    public Carnivorous(String name, double speed) {
        super(name, speed);
    }

    @Override
    public boolean eat(Food food) {
        if(food instanceof Meat) {
            return true;
        }
        else {
            return false;
        }
    }
}
