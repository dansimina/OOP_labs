// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Carte cartea1 = new Carte("Cartea 1", new Autor("Nume1", "Prenume1", 50), 1, 10);
        Carte cartea2 = new Carte("Cartea 2", new Autor("Nume1", "Prenume1", 55), 2, 3);
        Carte cartea3 = new Carte("Cartea 3", new Autor("Nume2", "Prenume2", 60), 3, 4);
        Carte cartea4 = new Carte("Cartea 4", new Autor("Nume2", "Prenume2", 65), 3, 6);
        Carte cartea5 = new Carte();
        Carte cartea6 = new Carte("Cartea 6", new Autor("Nume3", "Prenume3", 65), 4, 0);

        System.out.println("Introduc cartile: ");
        biblioteca.adaugaCarte(cartea1);
        biblioteca.adaugaCarte(cartea2);
        biblioteca.adaugaCarte(cartea3);
        biblioteca.adaugaCarte(cartea4);
        biblioteca.adaugaCarte(cartea5);
        biblioteca.adaugaCarte(cartea6);

        System.out.println("\nAfisez cartile din biblioteca: ");
        biblioteca.listeazaCarti();

        System.out.println("\n Caut carti: ");
        System.out.println(biblioteca.gasesteCarteDupaTitlu("Cartea 1"));
        System.out.println(biblioteca.gasesteCarteDupaTitlu("Cartea 2"));
        System.out.println(biblioteca.gasesteCarteDupaTitlu("Cartea 3"));
        System.out.println(biblioteca.gasesteCarteDupaTitlu("Cartea 4"));
        System.out.println(biblioteca.gasesteCarteDupaTitlu("Cartea 5"));
        System.out.println(biblioteca.gasesteCarteDupaTitlu("Cartea 6"));
    }
}