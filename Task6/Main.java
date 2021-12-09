package task6;

import java.util.HashMap;
import java.util.Map;

public class Task6 {
    public static void main(String[] args) {
        Map<String, User> map = new HashMap<String, User>();
        User u1 = new User("Oleg", "Komenda", 18, "olegkomenda12@gmail.com");
        User u2 = new User("Name1", "Surname1", 18, "name1.surname1@gmail.com");
        User u3 = new User("Name2", "Surname2", 25, "name2.surname2@gmail.com");
        User u4 = new User("Name3", "Surname3", 21, "name3.surname3@gmail.com");

        map.put(u1.firstName, u1);
        map.put(u2.firstName, u2);
        map.put(u3.firstName, u3);
        map.put(u4.firstName, u4);
        map.put(u3.firstName, u1);
        map.put(u1.firstName, u4);

        User findFirstUser = map.get("Oleg");
        User findSecondUser = map.get("Name1");
        User findThirdUser = map.get("Oleg");
        User findForthUser = map.get("Name2");

        findFirstUser.PrintInfo();
        findSecondUser.PrintInfo();
        findThirdUser.PrintInfo();
        findForthUser.PrintInfo();

        map.remove("Oleg");
        map.remove("Name2");
        map.remove("Name3");

    }
}
