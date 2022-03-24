package ObjectProgramming;

public class UserTest {
    public static void main(String[] args) {

// User user = new User();

        User user = new User("Tomek", "hello");
//        User user = new User();
//        user.username = "Bartek";
//        user.password = "qwerty";

        System.out.println(user.username);
        System.out.println(user.password);

        user.sayHello();


    }
}
