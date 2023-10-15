import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dati dimensiunile tablei de sah: ");

        System.out.print("n = ");
        Integer n = in.nextInt();

        System.out.print("m = ");
        Integer m = in.nextInt();


        if(n.equals(0) || m.equals(0))
            System.out.print(0);
        else{
            BigInteger nrBoabeGrau = BigInteger.valueOf(0);
            BigInteger doi = BigInteger.valueOf(2);

            for(int i = 0; i < n * m; i++) {
                    nrBoabeGrau = nrBoabeGrau.add(doi.pow(i));
                }

            System.out.println("Numarul boabelor de grau este: " + nrBoabeGrau);
        }
    }
}