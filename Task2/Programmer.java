package task2;

public class Programmer extends Employee {
    public double salary;
    public static boolean isProgrammer;

    public Programmer(String name, boolean hasSalary, double salary) {
        super(name, hasSalary);
        this.salary = salary;
        System.out.println("Конструктор класу Programmer");
    }

    static {
        isProgrammer = true;
        System.out.println("Статичне поле класу Programmer");
    }
}
