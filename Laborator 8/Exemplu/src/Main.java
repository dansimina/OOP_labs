import java.util.FormatFlagsConversionMismatchException;
import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int codPin;

        while(true) {
            try {
                codPin = in.nextInt();
                float hash = 1 / codPin;
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("Pin gresit");
                in.next();
            }
            catch (ArithmeticException e) {
                System.out.println("Pinul nu poate fi 0");
            }
        }
    }
}