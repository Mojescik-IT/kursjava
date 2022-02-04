public class InkrementacjaDekrementacja {

    public static void main(String[] args) {
        //inkrementacja - zwiększenie wartości o jeden (PRE/POST)

        int a = 0;
        System.out.println("Wartość a: " + a); //0
        int b = a++; //postinkrementacja
        System.out.println("Wartość b: " + b); //0
        System.out.println("Wartość a: " + a); //1
        int c = ++a; //preinkrementacja
        System.out.println("Wartość c: " + c); //2
        System.out.println("Wartość a: " + a); //2

        System.out.println("===============================");

        //dekrementacja = zmniejszanie wartości o jeden  (PRE/POST)
        int d = 0;
        System.out.println("Wartość d: " + d); //0
        int e = d--; //postdekrementacja
        System.out.println("Wartość b: " + e); //0
        System.out.println("Wartość a: " + d); //-1
        int f = --d; //predekrementacja
        System.out.println("Wartość c: " + f); //-2
        System.out.println("Wartość a: " + d); //-2

    }






}
