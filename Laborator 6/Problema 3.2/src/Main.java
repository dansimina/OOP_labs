// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Ghiozdan ghiozdan = new Ghiozdan();

        Rechizita caietUnu = new Caiet("caiet_unu");
        Rechizita manualUnu = new Manual("manual_unu");
        ghiozdan.add(caietUnu);
        ghiozdan.add(manualUnu);

        Caiet caietDoi = new Caiet("caiet_doi");
        Manual manualDoi = new Manual("manual_doi");
        ghiozdan.add(caietDoi);
        ghiozdan.add(manualDoi);

        Rechizita caietTrei = new Caiet("caiet_trei");
        Rechizita manualTrei = new Manual("manual_trei");
        ghiozdan.add(caietTrei);
        ghiozdan.add(manualTrei);

        Rechizita caietPatru = new Caiet("caiet_patru");
        ghiozdan.add(caietPatru);

        System.out.println("Numar rechizite: " + ghiozdan.getNumarRechizite());
        System.out.println("Numar caiete: " + ghiozdan.getNumarCaiete());
        System.out.println("Numar manuale: " + ghiozdan.getNumarManuale());

        System.out.println("\nToate obiectele:");
        ghiozdan.listItems();

        System.out.println("\nToate caietele:");
        ghiozdan.listCaiet();

        System.out.println("\nToate manualele:");
        ghiozdan.listManual();
    }
}