// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        PerecheInt p1 = new PerecheInt(10, 5);
//        System.out.println(p1);
//
//        PerecheString p2 = new PerecheString("ABC", "D");
//        System.out.println(p2);

        Pereche<Integer> p1 = new Pereche<>(10, 2);
        Pereche<String> p2 = new Pereche<>("ABC", "D");
        System.out.println(p2);
        p2.afisareDuala("OOP");
        p1.afisareDuala(10);

        p1.afisareCuPereche(p1);
        p1.afisareCuPereche(p2);
//        p1.afisareCuPereche("ABC"); nu merge

        p1.afisareCuPereche(p2, "ceva");

        Pereche2<Integer> p3 = new Pereche2<>(1, 2);
        System.out.println(p3);

        Pereche<Number> p4 = new Pereche<>(3, 5);
        m1(p4);
        m2(p1);
    }

    static void m1(Pereche<Number> num) {
        System.out.println(num);
    }

    static <T extends Number> void m2(Pereche<T> num) {
        System.out.println(num);
    }
}