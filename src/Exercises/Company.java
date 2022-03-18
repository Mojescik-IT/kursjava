package Exercises;

public class Company {
    public static void main(String[] args) {


        Worker worker1 = new Worker();
        Worker worker2 = new Worker();


        worker1.name = "Staszek";
        worker1.surname = "Kowalski";
        worker1.age = 18;
        worker2.name = "Jan";
        worker2.surname = "Nowak";
        worker2.age = 22;


        System.out.println("Workers from company: ");
        System.out.println(worker1.name + " " + worker1.surname + " " + worker1.age + " ");
        System.out.println(worker2.name + " " + worker2.surname + " " + worker2.age + " ");

    }

}
