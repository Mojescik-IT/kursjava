package ObjectProgramming;

import java.util.Scanner;

public class StudentChecker {

    public static void main(String[] args) {


        Student przemek = new Student();
        przemek.imie = "Przemek";
        przemek.nazwisko = "Mojescik";
        przemek.nick = "przemoj";
        przemek.email = "przemoj@gmail.com";
        przemek.numerIndeksu = 3597;


        Student kasia = new Student();
        kasia.imie = "Kasia";
        kasia.nazwisko = "Kowalska";
        kasia.nick = "kaskow";
        kasia.email = "kaskow@gmail.com";
        kasia.numerIndeksu = 7953;

        Student piotr = new Student();
        piotr.imie = "Piotr";
        piotr.nazwisko = "Nowak";
        piotr.nick = "pionow";
        piotr.email = "pionow@gmail.com";
        piotr.numerIndeksu = 5397;


        Student[] students = new Student[3];
        students[0] = przemek;
        students[1] = kasia;
        students[2] = piotr;


        for (int i = 0; i < students.length; i++) {
            students[i].przedstawSie();
            students[i].podajEmail();
            students[i].podajNrIndeksu();
            students[i].zalogujSie();
            System.out.println("-----------------------");
        }


        String imie = "Kasia";
        imie.strip();
        Scanner scanner = new Scanner(System.in);





    }
}
