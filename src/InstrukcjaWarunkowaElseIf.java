public class InstrukcjaWarunkowaElseIf {

    public static void main(String[] args) {

        int number = 12;

        if (number == 0) {
            System.out.println("Liczba jest równa zero");
        } else if (number > 10) {
                 System.out.println("Lczba wieksza od 10");
        } else if (number > 0) {
            System.out.println("Liczba jest większa od zera - DODATNIA");
        } else if (number < -5) {
            System.out.println("Liczba jest mniejsza od -5");
        } else {
            System.out.println("Żaden warunek nie został spełniony!");

        }
    }
}
