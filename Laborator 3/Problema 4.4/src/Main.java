// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String str1 = "Ana are ";
        String str2 = "mere";
        String str3 = str1 + str2;
        System.out.println(str3 == "Ana are mere");
        System.out.println(str3.equals("Ana are mere"));
    }
}