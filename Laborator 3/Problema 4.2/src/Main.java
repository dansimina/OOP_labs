// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int varsta = 20, sex = 1, inaltime = 127;
        short impachetareInfo;

        impachetareInfo = (short) inaltime;
        impachetareInfo = (short) (impachetareInfo | (sex << 8));
        impachetareInfo = (short) (impachetareInfo | (varsta << 9));

        int despachetareVarsta, despachetareSex, despachetareInaltime;

        despachetareInaltime = impachetareInfo & 0x0F;
        despachetareSex = (impachetareInfo >> 8) & 1;
        despachetareVarsta = (impachetareInfo >> 9) & 0x7F;

        System.out.println("Inaltime = " + inaltime + "\n" + "Sex = " + despachetareSex + "\n" + "Varsta = " + despachetareVarsta);

    }
}