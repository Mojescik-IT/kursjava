import java.util.Scanner;

public class OperatoryPorownania2 {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int secondNumber = scanner.nextInt();

        boolean result = secondNumber > firstNumber;
        System.out.println("Pierwsza liczba to: " + firstNumber);
        System.out.println("Druga liczba liczba to: " + secondNumber);


        System.out.println("a > b " + (firstNumber > secondNumber));
        System.out.println("a < b " + (firstNumber < secondNumber));
        System.out.println("a >= b " + (firstNumber >= secondNumber));
        System.out.println("a <= b " + (firstNumber <= secondNumber));
        System.out.println("a == b " + (firstNumber == secondNumber));
        System.out.println("a != b " + (firstNumber != secondNumber));

    }


}
