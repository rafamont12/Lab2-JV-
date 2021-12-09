package Task1;

public class Task1 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[] {
                new Carnivorous("Jaguar", 80),
                new Carnivorous("Puma", 75),
                new Herbivorous("Equus", 88),
                new Herbivorous("Rabbit", 20)
        };

        Food[] food = new Food[] {
                new Herb("grass"),
                new Meat("meat"),
                new Herb("roots")
        };

        for(Animal a : animals) {
            a.run();
            for(Food f : food) {
                System.out.println(a.name + " їсть " + f.type + "? - " + a.eat(f));
            }
            System.out.println("");
        }

    }
}
