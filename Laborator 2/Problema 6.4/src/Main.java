public class Main {
    public static void main(String[] args) {
//        int a = 10;
//        a /= 0;
//
//        System.out.println("Împărțiti un întreg la zero: " + a);



        double neg = -1.0;
        double poz = 1.0;

        neg /= 0;
        poz /= 0;

        System.out.println("Împărțiți un număr negativ în virgulă mobilă la zero; apoi unul pozitiv la zero: " + neg + " " + poz);



        double inf = Double.POSITIVE_INFINITY;

        double rez = inf - inf;
        System.out.println("Scădeți în virgulă mobilă din Infinit un alt Infinit: " + rez);



        double pozInf = Double.POSITIVE_INFINITY;
        double negInf = Double.NEGATIVE_INFINITY;

        double prodINf = pozInf * negInf;

        System.out.println("Înmulțiți în virgulă mobilă Infinit cu -Infinit: " + prodINf);



//        boolean bool;
//        int a = 10;
//
//        bool = a;
//
//        System.out.println("Asignați unei valori booleene un întreg: " + bool);



//        int a;
//        double b = 1.1;
//        a = b;
//
//        System.out.println("Asignați unei valori booleene un întreg " + a);
    }
}