package ObjectProgramming;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ChceckedExceptions {


    public static void main(String[] args) {
        try { //kod który chcemy spróbować wykonać
            System.out.println("Before reading file");
            readFile("E:\\JavaProjects\\kursjava\\src\\ObjectProgramming\\test.txt");
            System.out.println("Closing file");
        } catch (FileNotFoundException e) { //łapiemy wyjątek jeżeli kod wyżej się nie wykonał
            System.out.println("Wyjatek został wyrzucony");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Every");
        }
    }

    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);

    }

}
