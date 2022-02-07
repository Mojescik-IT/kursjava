// Umożliwia cykliczne wykonywanie ciągu instrukcji określoną liczbę razy
public class For {

    public static void main(String[] args) {

        int number = 100;
        //i - specjalna zmienna sterująca
        for (int i = 0; i < number; i = i + 2) {
            System.out.println(i);
        }

        System.out.println("=====================");
        int secondNumber = 0;
        for (int i = 100; i > secondNumber; i--) {
            System.out.println(i);
        }

        System.out.println("====================");
        //liczby podzielne przez 5
        for (int i = 0; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("==========================");
        //pętla na innej zmiennej sterującej np. sth (something)
        for (int sth = 0; sth < 300; sth++) {
            System.out.println("Bede robil prace domowe");
        }


    }


}
