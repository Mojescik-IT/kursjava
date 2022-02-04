import java.util.Scanner;


//Zapytaj użytkownika o wiek. W przypadku gdy ma mniej niż 18 lat na ekranie wyświetl informację, że nie może kupić alkoholu.
// Gdy więcej niż 18 to podziękuj za zakupy.
public class AgeChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój wiek: ");
        int age = scanner.nextInt();
        System.out.println("Twój wiek to: " + age);
        System.out.println("============================");

        if (age < 18 && age > 0) {
            System.out.println("Nie możesz kupić alkoholu. Masz poniżej 18 lat");
        } else if (age >= 18) {
            System.out.println("Możesz kupić alkohol. Masz " + age + " lat" + "\n" + "Dziękujemy za zakupy!");
        } else if (age <= 0) {
            System.out.println("Podaj poprawny wiek!");
        }
    }


}


