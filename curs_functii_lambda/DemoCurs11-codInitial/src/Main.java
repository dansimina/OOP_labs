
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Carte> carti = CatalogCarti.initializeazaCatalog();
        for (Carte c:carti)
            System.out.println(c);

        System.out.println();
        System.out.println();
        afiseazaCartiBIOGRAFICE(carti);

        System.out.println();
        System.out.println();
        afiseazaCartiFICTIUNE(carti);

        System.out.println();
        System.out.println();
        afisareCartiSub30Lei(carti);

        System.out.println();
        System.out.println();
        afiseazaCarti(carti, new CarteIeftina());

        System.out.println();
        System.out.println();
        afiseazaCarti(carti, new Predicate<Carte>() {
            @Override
            public boolean test(Carte carte) {
                return carte.getTip() == TipCarte.BIOGRAFIE;
            }
        });

        System.out.println();
        System.out.println();
        afiseazaCarti(carti, new PredicatPretCarte(50){
            int numarPagini;
            {
                numarPagini = 400;
                System.out.println("Init numarPagini: " + numarPagini);
            }
            @Override
            public boolean test(Carte c) {
                return super.test(c) && c.getNrPagini() > numarPagini;
            }
        });

        System.out.println();
        System.out.println();
        afiseazaCarti(carti, (c)->{return c.getPret() < 35 && c.getNrPagini() > 400;});

        System.out.println();
        System.out.println();
        afiseazaCarti(carti, (c)->{return c.getTip() == TipCarte.BIOGRAFIE;});
    }

    private static void afiseazaCarti(Iterable<Carte> carti, Predicate<Carte> pr) {
        for(Carte c: carti) {
            if(pr.test(c)) System.out.println(c);
        }
    }

    private static void afiseazaCartiBIOGRAFICE(List<Carte> carti) {
        for(Carte c: carti) {
            if(c.getTip() == TipCarte.BIOGRAFIE) {
                System.out.println(c);
            }
        }
    }

    private static void afiseazaCartiFICTIUNE(List<Carte> carti) {
        for(Carte c: carti) {
            if(c.getTip() == TipCarte.FICTIUNE) {
                System.out.println(c);
            }
        }
    }

    private static void afisareCartiSub30Lei(List<Carte> carti) {
        for(Carte c: carti) {
            if(c.getPret() < 30) {
                System.out.println(c);
            }
        }
    }
}