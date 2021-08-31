import java.util.Scanner;

public class OperatoryPorownaniaHomework {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę do porównania: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbe do porównania: ");
        int secondNumber = scanner.nextInt();




        System.out.println(firstNumber + ">" + secondNumber + "  " + (firstNumber > secondNumber)); //false
        System.out.println(firstNumber + "<" + secondNumber + ": " + (firstNumber < secondNumber)); // true
        System.out.println(firstNumber + ">=" + secondNumber + ": " + (firstNumber >= secondNumber)); // false
        System.out.println(firstNumber + "<=" + secondNumber + ": " + (firstNumber <= secondNumber)); // true
        System.out.println(firstNumber + "==" + secondNumber + ": " + (firstNumber == secondNumber)); // false
        System.out.println(firstNumber + "!=" + secondNumber + ": " + (firstNumber != secondNumber)); // true

    }
}
