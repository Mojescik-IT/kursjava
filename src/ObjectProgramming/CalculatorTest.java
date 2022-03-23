package ObjectProgramming;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Pierwsza liczba to: " + firstNumber + "\n" +
                "Druga liczba to: " + secondNumber);

        System.out.println("==================================");

        Calculator calculator = new Calculator();

        int addition = calculator.add(firstNumber, secondNumber);
        int subtraction = calculator.sub(firstNumber, secondNumber);
        int multiplication = calculator.mult(firstNumber, secondNumber);
        float division = calculator.div(firstNumber, secondNumber);;
        int mod = calculator.mod(firstNumber, secondNumber);

        System.out.println("Dodawanie: " + addition);
        System.out.println("Odejmowanie: " + subtraction);
        System.out.println("Mnożenie: " + multiplication);
        System.out.println("Dzielenie: " + division);
        System.out.println("Moduloo: " + mod);


    }
}
