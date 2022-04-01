package ObjectProgramming;

public class PersonTest {

    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher("Tom", 29, "university");
        System.out.println("-------------------");
//        teacher.name = "Tom";
//        teacher.age = 29;
        teacher.walk();
        teacher.eat();
        teacher.sayHello();
        teacher.teachMatch();

        System.out.println("-------------------");
        Footballer footballer = new Footballer("Mike", 21, "FCB");
        System.out.println("-------------------");
//        footballer.name = "Mike";
//        footballer.age = 21;
        footballer.walk();
        footballer.eat();
//        footballer.footballClub = "FC B";
        footballer.playFootball();

    }
}
