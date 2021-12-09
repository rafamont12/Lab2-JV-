package task4;

import task1.*;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Carnivorous("Jaguar", 80));
        animals.add(new Carnivorous("Puma", 75));
        animals.add(new Herbivorous("Equus", 88));
        animals.add(new Herbivorous("Rabbit", 20));

        List<Food> food = new ArrayList<Food>();
        food.add(new Herb("grass"));
        food.add(new Meat("meat"));
        food.add(new Herb("roots"));

        for(Animal a : animals) {
            a.run();
            for(Food f : food) {
                System.out.println(a.name + " їсть " + f.type + "? - " + a.eat(f));
            }
            System.out.println("");
        }
    }
}
