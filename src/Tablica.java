// struktury pozwalające gromadzić większą ilość danych
public class Tablica {

    public static void main(String[] args) {

        String[] imiona = new String[3];
//przypisanie elementów do tablicy
        imiona[0] = "Bartek";
        imiona[1] = "Basia";
        imiona[2] = "Michał";
//odczytanie elementów z tablicy
        System.out.println(imiona[0]);
        System.out.println(imiona[1]);
        System.out.println(imiona[2]);

        System.out.println("===========================");

        //drugi sposób zadeklarowania tablicy
        int[] lottoNumbers = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(lottoNumbers[0]);
        System.out.println(lottoNumbers[1]);
        System.out.println(lottoNumbers[2]);
        System.out.println(lottoNumbers[3]);
        System.out.println(lottoNumbers[4]);
        System.out.println(lottoNumbers[5]);

        System.out.println(lottoNumbers.length); //długość tablicy
        System.out.println("===============================");


        for (int i = 0; i < imiona.length; i++) {
            System.out.println(imiona[i]);
        }

    }

}
