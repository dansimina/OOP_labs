import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> listaCuvinte = new HashMap<>();
        String s = "Buna ce faci? Buna, sunt mai bine. buna foarte bine";

        char[] caractereDeSters = new char[]{'.', '!', '?', ','};
        for(char c: caractereDeSters) {
            s = s.replace(c, ' ');
        }
        s = s.toLowerCase();
        String[] cuvinte = s.split(" ");

        for(String cuv: cuvinte) {
            if(cuv.compareTo(" ") != 0 && cuv.compareTo("") != 0) {
                if(!listaCuvinte.containsKey(cuv)) {
                    listaCuvinte.put(cuv, 1);
                }
                else {
                    listaCuvinte.replace(cuv, listaCuvinte.get(cuv) + 1);
                }
            }
        }

        System.out.println(listaCuvinte);
    }
}