package ObjectProgramming;

public class MathTeacher extends Person {

    public String schoolName;

    public MathTeacher(String name, int age, String schoolName) {
        super(name, age);
        System.out.println("Jestem w konstruktorze MathTeacher");
        this.schoolName = schoolName;
    }


    public void walk() {
        System.out.println("I walk very fast!");
    }


    public void teachMatch() {
        System.out.println("I am teaching Math!");
    }

    public void sayHello() {
        System.out.println("Hello my name is:" + name);
        System.out.println("I am: " + age);
    }


}
