// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws ExceptieZiNelucratoare {
        Lucrator l = new Lucrator("Gigel");
        try {
            l.lucreaza("Luni");
        } catch (ExceptieZiNelucratoare e) {
            System.out.println(e.getMessage());
        }
        try {
            l.lucreaza("Marte");
        } catch (ExceptieZiNelucratoare e) {
            System.out.println(e.getMessage());
        }
        try {
            l.lucreaza("Duminica");
        } catch (ExceptieZiNelucratoare e) {
            System.out.println(e.getMessage());
        }
    }
}