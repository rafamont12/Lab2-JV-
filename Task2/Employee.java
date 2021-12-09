package task2;

public class Employee extends Person {
    public boolean hasSalary;
    public static boolean isEmployee;

    public Employee(String name, boolean hasSalary) {
        super(name);
        this.hasSalary = hasSalary;
        System.out.println("Конструктор класу Employee");
    }

    static {
        isEmployee = true;
        System.out.println("Статичне поле класу Employee");
    }
}
