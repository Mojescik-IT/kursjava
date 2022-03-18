package ObjectProgramming;

public class AutoTest {

    public static void main(String[] args) {

        Auto mercedes = new Auto();
        mercedes.marka = "Mercedes";
        mercedes.model = "Klasa S";
        mercedes.rok = 1990;
        mercedes.przebieg = 2000000;

        mercedes.info();
        System.out.println("---------------");
        mercedes.jedz();
        System.out.println("---------------");
        mercedes.hamuj();


        Auto audi = new Auto();
        audi.marka = "Audi";
        audi.model = "A7";
        audi.rok = 2000;
        audi.przebieg = 100000;


        audi.info();
        audi.jedz();
        audi.hamuj();


        Auto noName = new Auto();
        noName.jedz();
        noName.hamuj();
        noName.info();



    }

}
