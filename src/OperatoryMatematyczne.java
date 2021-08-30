//OPERATORY MATEMATYCZNE - umożliwiają wykonywanie podstawowych operacji matematycznych
public class OperatoryMatematyczne {

    public static void main(String[] args) {


        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4.0F;


        int addition = firstNumber + secondNumber; //10
        int subtraction = firstNumber - secondNumber; //-2
        int multiplication = firstNumber * secondNumber; //24
        float division = thirdNumber / secondNumber; //0,66
        int mod = secondNumber % firstNumber; //4 mieści się w 6 = 1, r.2


        System.out.println("Dodawanie: " + addition); //+
        System.out.println("Odejmowanie: " + subtraction); //+
        System.out.println("Mnożenie: " + multiplication); //+
        System.out.println("Dzielenie: " + division); //? - zmiana na float //+
        System.out.println("Modulo: " + mod); //+

        System.out.println("=================================================");

        firstNumber+=secondNumber;  //firstNumber = firstNumber + secondNumber
        System.out.println("Po dodawaniu: " + firstNumber);  //10
        firstNumber-=secondNumber;  //firstNumber = firstNumber - secondNumber
        System.out.println("Po odejmowaniu: " + firstNumber);   //4
        firstNumber*=secondNumber;  //firstNumber = firstNumber * secondNumber
        System.out.println("Po mnożeniu: " + firstNumber);  //24
        firstNumber/=secondNumber;  //firstNumber = firstNumber / secondNumber
        System.out.println("Po dzieleniu: " + firstNumber); //4
        firstNumber%=secondNumber;  //firstNumber = firstNumber % secondNumber
        System.out.println("Po modulo: " + firstNumber);    //4

    }

}
