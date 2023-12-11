import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Punct<Integer> p1 = new Punct<>(1, 5);
        Punct<Double> p2 = new Punct<>(1.5, 5.9);
        Punct<Float> p3 = new Punct<>((float) 1.2,(float) 2.3);

        ArrayList<Punct> arr = new ArrayList<>();
        arr.add(p1);
        arr.add(p2);
        arr.add(p3);

        System.out.println(arr);

        System.out.println(p1.distanta(p2));
    }
}