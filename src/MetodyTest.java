import ObjectProgramming.Metody;

public class MetodyTest {


    public static void main(String[] args) {


        Metody metody = new Metody();
        metody.policzWynikParam(2);
        metody.policzWynikParam(100);
        metody.policzWynikParam(23);

        int result = metody.add(2, 10);
        System.out.println(metody.add(2, 3));
        System.out.println(result);


    }
//        metody.policzWynik();
//        metody.policzWynik();
//        metody.policzWynik();
//        int result = metody.pobierzWynik();
//        int result2 = result * 2;
//        System.out.println("-----------------------");
//        System.out.println("Rezultat przed mnożeniem: " + result);
//        System.out.println("Rezultat po mnożeniu: " + result2);
//    }
}
