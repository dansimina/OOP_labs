import java.util.HashSet;

public class Abonat {
    private int subscriberId;
    private String nume;
    private Abonament abonament;
    private HashSet<Film> wishList;
    private HashSet<Film> alreadyWatchedList;

    private static int ultimulId = 0;

    public Abonat() {
        ultimulId++;
        this.subscriberId = ultimulId;
        wishList = new HashSet<>();
        alreadyWatchedList = new HashSet<>();
    }

    public Abonat(String nume, Abonament abonament) {
        ultimulId++;
        this.subscriberId = ultimulId;
        wishList = new HashSet<>();
        alreadyWatchedList = new HashSet<>();
        this.subscriberId = subscriberId;
        this.nume = nume;
        this.abonament = abonament;
    }

    public void vizioneazaFilm(Film film) throws FilmIndisponibilException {
        if (film.isEsteDisponibil()) {
            wishList.remove(film);
            alreadyWatchedList.add(film);
        }
        else
            throw new FilmIndisponibilException("Filmul nu e disponibil pentru streaming!");
    }

    public void adaugaFilmInWishList(Film film) throws PremiumNotEnabledException {
        if (abonament.getTipAbonament().compareToIgnoreCase("premium") == 0) {
            wishList.add(film);
        }
        else
            throw new PremiumNotEnabledException("Trebuie sa ai premium!");
    }

    public int getSubscriberId() {
        return subscriberId;
    }

    public String getNume() {
        return nume;
    }

    public Abonament getAbonament() {
        return abonament;
    }

    public HashSet<Film> getWishList() {
        return wishList;
    }

    public HashSet<Film> getAlreadyWatchedList() {
        return alreadyWatchedList;
    }

    public static int getUltimulId() {
        return ultimulId;
    }

    public void setAbonament(Abonament abonament) {
        this.abonament = abonament;
    }

    @Override
    public String toString() {
        return "Abonat{" +
                "subscriberId=" + subscriberId +
                ", nume='" + nume + '\'' +
                ", abonament=" + abonament +
                ", wishList=" + wishList +
                ", alreadyWatchedList=" + alreadyWatchedList +
                '}';
    }
}
