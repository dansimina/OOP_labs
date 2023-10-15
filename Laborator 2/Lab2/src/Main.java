import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int numar;
       numar = in.nextInt();

       System.out.println("Numarul este: " + numar);

       int maxInt = Integer.MAX_VALUE;
       maxInt += 1;

       System.out.println(maxInt);

    }
}