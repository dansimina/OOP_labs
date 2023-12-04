import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Persoana autor1 = new Persoana("J.K. Rowling", 1);
        Persoana autor2 = new Persoana("Rick Riordan", 2);
        Persoana autor3 = new Persoana("J. R. R. Tolkien", 3);

        Carte carte1 = new Carte("Harry Potter și piatra filozofală", autor1, 1997, "Egmont");
        Carte carte2 = new Carte("Harry Potter și Camera Secretelor", autor1, 1998, "Egmont");
        Carte carte3 = new Carte("Harry Potter și Prizonierul din Azkaban", autor1, 1999, "Egmont");
        Carte carte4 = new Carte("Harry Potter și Pocalul de Foc", autor1, 2000, "Egmont");

        Carte carte5 = new Carte("Percy Jackson şi Olimpienii (#1). Hoţul fulgerului", autor2, 2022, "Arthur");
        Carte carte6 = new Carte("Percy Jackson şi Olimpienii (#4). Bătălia din Labirint", autor2, 2023, "Arthur");

        Carte carte7 = new Carte("The Fellowship of the Ring", autor3, 1954, "RAO");
        Carte carte8 = new Carte("The Two Towers", autor3, 1954, "RAO");
        Carte carte9 = new Carte("The Return of the King", autor3, 1955, "RAO");


        ArrayList<Carte> arr = new ArrayList<>();
        arr.add(carte1);
        arr.add(carte2);
        arr.add(carte3);
        arr.add(carte4);
        arr.add(carte5);
        arr.add(carte6);
        arr.add(carte7);
        arr.add(carte8);
        arr.add(carte9);
        arr.add(carte1);

//        Collections.sort(arr);
//
//        for(Carte i: arr) {
//            System.out.println(i);
//        }

        LinkedList<Carte> lista = new LinkedList<>();
        lista.add(carte1);
        lista.add(carte2);
        lista.add(carte3);
        lista.add(carte4);
        lista.add(carte5);
        lista.add(carte6);
        lista.add(carte7);
        lista.add(carte8);
        lista.add(carte9);
        lista.addFirst(carte6);

        for(Carte i: lista) {
            System.out.println(i);
        }
    }
}