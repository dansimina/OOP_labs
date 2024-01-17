import java.util.HashMap;
import java.util.Map;

public class ServiciuStreamingFilme {
    private Map<String, Film> filme;
    private Map<String, Abonat> abonati;
    private static int numarFilmeComedie;

    public ServiciuStreamingFilme() {
        filme = new HashMap<>();
        abonati = new HashMap<>();
    }

    public void adaugaFilm(Film film) {
        filme.put(film.getTitlu(), film);
        if (film.getGen().compareToIgnoreCase("comedie") == 0) {
            numarFilmeComedie++;
        }
    }

    public void stergeFilm(String numeFilm) {
        Film filmDeSters = filme.get(numeFilm);

        if (filmDeSters.getGen().compareToIgnoreCase("comedie") == 0) {
            numarFilmeComedie--;
        }
        filme.remove(numeFilm);
    }

    public void stergeAbonat(String numeAbonat) {
        abonati.remove(numeAbonat);
    }

    public void adaugaAbonat(Abonat abonat) {
        abonati.put(abonat.getNume(), abonat);
    }

    public Film cautaFilm(String numeFilm) throws FilmIndisponibilException {
        if (filme.containsKey(numeFilm))
            return filme.get(numeFilm);
        else
            throw new FilmIndisponibilException("Filmul nu este disponibil!");
    }

    public int getNumarFilmeComedie() {
        return numarFilmeComedie;
    }

    @Override
    public String toString() {
        return "ServiciuStreamingFilme{" +
                "\nfilme=" + filme +
                "\nabonati=" + abonati +
                '}';
    }
}
