import java.lang.reflect.Array;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Persoana[] array = new Persoana[10];

        for(int i = 0; i < 10; i++) {
            Integer k = (int) (Math.random() * 9) + 1;
            array[i] = new Persoana(k.toString(), k.toString(), i);
        }

        for(int i = 0; i < 10; i++)
            System.out.println(array[i].toString());

        Arrays.sort(array);
        System.out.println("Dupa sortare");
        for(int i = 0; i < 10; i++)
            System.out.println(array[i].toString());
    }
}