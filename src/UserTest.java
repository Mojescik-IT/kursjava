public class UserTest {

    public static void main(String[] args) {
//        User user = new User();

        User user = new User("Przemek", "hello");

//        user.username = "Przemek";
//        user.password = "qwert";
        System.out.println(user.username);
        System.out.println(user.password);
        user.sayHello();
    }
}
