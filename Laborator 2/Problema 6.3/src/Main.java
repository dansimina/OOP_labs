// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int maxInt = Integer.MAX_VALUE;
        long maxLong = Long.MAX_VALUE;

        maxInt += 1;
        maxLong += 1;

        System.out.println("Adunaţi o cantitate întreagă la cel mai mare întreg primitiv din fiecare categorie de întregi: int: " + maxInt + " long: " + maxLong);



        int minInt = Integer.MIN_VALUE;
        long minLong = Long.MIN_VALUE;

        minInt -= 1;
        minLong -= 1;

        System.out.println("Scădeţi o cantitate întreagă din cel mai mic întreg primitiv din fiecare categorie de întregi: int: " + minInt + " long: " + minLong);



        float maxFloat = Float.MAX_VALUE;
        double maxDouble = Double.MAX_VALUE;

        maxFloat *= 2;
        maxDouble *= 2;

        System.out.println("Înmulțiți cel mai mare număr real reprezentat în simplă și dublă precizie cu o valoare supraunitară: float: " + maxFloat + " double: " + maxDouble);



        double nrCuMulteZecimale = (double) 10 / 3;
        System.out.println("Reprezentaţi în virgulă mobilă numere cu un număr de cifre zecimale mai mare decât numărul de cifre reprezentabile exact: " + nrCuMulteZecimale);

        double a = (double) 10 / 3;
        double b = (double) 2 / 9;

        double rez = a + b;

        System.out.println("adunaţi sau scădeţi cantităţi din numere care au mai multe cifre zecimale în reprezentarea în baza 10 decât permite reprezentarea în virgulă mobilă: a = " + a + " b = " + b + " rez = " + rez);
    }
}
