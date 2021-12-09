package task6;

public class User {
    public String firstName;
    public String lastName;
    public int age;
    public String email;

    public User(String firstName, String lastName, int age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    public void PrintInfo() {
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email + "\n");
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(obj.getClass() != getClass()) {
            return false;
        }
        User u = (User) obj;
        if(age != u.age) {
            return false;
        }
        else if(email != u.email) {
            return false;
        }
        else if(lastName != u.lastName) {
            return false;
        }
        else if(firstName != u.firstName) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (firstName == null ? 0 : firstName.hashCode());
        result = prime * result + (lastName == null ? 0 : lastName.hashCode());
        result = prime * result + age;
        result = prime * result + (email == null ? 0 : email.hashCode());
        return result;
    }
}
