import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Numar intreg: ");
        int i = in.nextInt();

        System.out.println("Numar in virgula mobila: ");
        float f = in.nextFloat();

        System.out.println("Numerele sunt: " + i + " si " + f);
    }
}