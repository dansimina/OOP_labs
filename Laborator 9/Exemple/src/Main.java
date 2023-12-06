import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<String> fructe = new ArrayList<>();
        fructe.add("apple");
        String apple = fructe.get(0);
//        fructe.set(0, "orange");
//        fructe.remove(0);
//        fructe.clear();
//        for(String i: fructe) {
//            System.out.println(i);
//        }

//        asa merge
//        for(int i = 0; i < fructe.toArray().length; i++) {
//            if(fructe.get(i).compareTo(new String("apple")) == 0)
//                fructe.set(i,"orange");
//        }

//        asa nu merge
//        for(String i: fructe) {
//            if(i.compareTo(new String("apple")) == 0)
//                i = "orange";
//        }


        ListIterator<String>  iterator = fructe.listIterator();
        while(iterator.hasNext()) {
            String t = iterator.next();
            if(t.compareTo(new String("apple")) == 0) {
                iterator.set("orange");
            }
        }

        for(String i: fructe) {
            System.out.println(i);
        }
    }
}