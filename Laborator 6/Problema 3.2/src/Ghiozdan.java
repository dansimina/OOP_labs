public class Ghiozdan {
    public static final int NUMAR_MAXIM_DE_RECHIZITE = 100;
    private int numarRechizite, numarCaiete, numarManuale;
    private Rechizita[] listaRechizite = new Rechizita[NUMAR_MAXIM_DE_RECHIZITE];

    public void add(Rechizita rechizita) {
        if (numarRechizite < NUMAR_MAXIM_DE_RECHIZITE) {
            for (int i = 0; i < NUMAR_MAXIM_DE_RECHIZITE; i++)
                if (listaRechizite[i] == null) {
                    listaRechizite[i] = rechizita;
                    numarRechizite++;

                    if (rechizita instanceof Caiet)
                        numarCaiete++;

                    if (rechizita instanceof Manual)
                        numarManuale++;

                    break;
                }
        }
    }

    public void add(Caiet caiet) {
        if (numarRechizite < NUMAR_MAXIM_DE_RECHIZITE) {
            for (int i = 0; i < NUMAR_MAXIM_DE_RECHIZITE; i++)
                if (listaRechizite[i] == null) {
                    listaRechizite[i] = caiet;
                    numarRechizite++;
                    numarCaiete++;

                    break;
                }
        }
    }

    public void add(Manual manual) {
        if (numarRechizite < NUMAR_MAXIM_DE_RECHIZITE) {
            for (int i = 0; i < NUMAR_MAXIM_DE_RECHIZITE; i++)
                if (listaRechizite[i] == null) {
                    listaRechizite[i] = manual;
                    numarRechizite++;
                    numarManuale++;

                    break;
                }
        }
    }

    public void listItems() {
        for (Rechizita item : listaRechizite) {
            if (item != null)
                System.out.println(item.getNume());
        }
    }

    public void listCaiet() {
        for (Rechizita item : listaRechizite) {
            if (item instanceof Caiet)
                System.out.println(item.getNume());
        }
    }

    public void listManual() {
        for (Rechizita item : listaRechizite) {
            if (item instanceof Manual)
                System.out.println(item.getNume());
        }
    }

    public int getNumarRechizite() {
        return numarRechizite;
    }

    public int getNumarCaiete() {
        return numarCaiete;
    }

    public int getNumarManuale() {
        return numarManuale;
    }
}
