package task1;

public class Herbivorous extends Animal {
    public Herbivorous(String name, double speed) {
        super(name, speed);
    }

    @Override
    public boolean eat(Food food) {
        if(food instanceof Herb) {
            return true;
        }
        else {
            return false;
        }
    }
}
