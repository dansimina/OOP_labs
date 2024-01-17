import java.util.Collection;

public class Film {
    private int movieId;
    private String titlu;
    private String gen;
    private int durata;
    private boolean esteDisponibil;
    private static int ultimulId = 0;

    public Film() {
        ultimulId++;
        this.movieId = ultimulId;
    }

    public Film(String titlu, String gen, int durata, boolean esteDisponibil) {
        ultimulId++;
        this.movieId = ultimulId;
        this.titlu = titlu;
        this.gen = gen;
        this.durata = durata;
        this.esteDisponibil = esteDisponibil;
    }

    public int getMovieId() {
        return movieId;
    }

    public String getTitlu() {
        return titlu;
    }

    public String getGen() {
        return gen;
    }

    public int getDurata() {
        return durata;
    }

    public boolean isEsteDisponibil() {
        return esteDisponibil;
    }

    public static int getUltimulId() {
        return ultimulId;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public void setEsteDisponibil(boolean esteDisponibil) {
        this.esteDisponibil = esteDisponibil;
    }

    @Override
    public String toString() {
        return "Film{" +
                "movieId=" + movieId +
                ", titlu='" + titlu + '\'' +
                ", gen='" + gen + '\'' +
                ", durata=" + durata +
                ", esteDisponibil=" + esteDisponibil +
                '}';
    }
}
