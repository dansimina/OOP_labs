public class Biblioteca {
    static final int NUMAR_MAXIM_DE_CARTI = 100;
    private Carte[] listaCarti = new Carte[NUMAR_MAXIM_DE_CARTI];

    public Biblioteca() {
    }

    private boolean cautaId(int id) {
        for (Carte carte : listaCarti) {
            if (carte != null && carte.getId() == id) {
                return true;
            }
        }

        return false;
    }

    public void adaugaCarte(Carte carteDeAdaugat) {
        if (carteDeAdaugat != null && carteDeAdaugat.getCopiiDisponibile() > 0 && cautaId(carteDeAdaugat.getId()) == false) {
            for (int i = 0; i < NUMAR_MAXIM_DE_CARTI; i++) {
                if (listaCarti[i] == null) {
                    listaCarti[i] = carteDeAdaugat;
                    return;
                }
            }
        }

        System.out.println("Cartea nu a putut fi adaugata!");
    }

    public void listeazaCarti() {
        for (Carte carte : listaCarti) {
            if (carte != null)
                System.out.println(carte);
        }
    }

    public Carte gasesteCarteDupaTitlu(String titlu) {
        for (Carte carte : listaCarti) {
            if (carte != null && carte.getTitlu().equals(titlu)) {
                return carte;
            }
        }

        System.out.println("Cartea nu a fost gasita!");
        return new Carte();
    }
}
