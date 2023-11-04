import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("m = ");
        int m = in.nextInt();
        System.out.print("n = ");
        int n = in.nextInt();

        if(m % 2 != 0)
            m ++;
        for(int i = m; i <= n; i += 2){
            int x = -1, y = -1;
            for(int j = 2; j <= i; j++){
                if(PrimeNumbers.isPrime(j) == true && PrimeNumbers.isPrime(i - j) == true){
                    x = j;
                    y = i - j;
                    break;
                }
            }
            if(x == -1 || y == -1){
                System.out.println("Nu exista");
            } else{
                System.out.println(i + " = " + x + " + " + y);
            }
        }
    }
}