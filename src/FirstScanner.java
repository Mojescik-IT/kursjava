import java.util.Scanner;

public class FirstScanner {


    public static void main(String[] args) {

        System.out.print("Wpisz swoje imie: ");

        Scanner scanner = new Scanner(System.in); //tworzenie nowego obiektu o nazwie scanner
        String name = scanner.nextLine(); //metoda nextLine
        System.out.println("Czesc " + name + " !");


    }


}
