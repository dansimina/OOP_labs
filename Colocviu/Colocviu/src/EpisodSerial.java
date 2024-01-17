public class EpisodSerial extends Film {
    private int numarSezon;
    private int numarEpisod;

    public EpisodSerial() {
        super();
    }

    public EpisodSerial(String titlu, String gen, int durata, boolean esteDisponibil, int numarSezon, int numarEpisod) {
        super(titlu, gen, durata, esteDisponibil);
        this.numarSezon = numarSezon;
        this.numarEpisod = numarEpisod;
    }

    public int getNumarSezon() {
        return numarSezon;
    }

    public int getNumarEpisod() {
        return numarEpisod;
    }

    public void setNumarSezon(int numarSezon) {
        this.numarSezon = numarSezon;
    }

    public void setNumarEpisod(int numarEpisod) {
        this.numarEpisod = numarEpisod;
    }

    @Override
    public String toString() {
        return "EpisodSerial{" +
                "numarSezon=" + numarSezon +
                ", numarEpisod=" + numarEpisod +
                '}';
    }
}
