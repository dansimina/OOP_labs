public class Carte {
    private String titlu;
    private Autor autor;
    private int id;
    private int copiiDisponibile;

    public Carte() {
    }

    public Carte(String titlu, Autor autor, int id, int copiiDisponibile) {
        this.titlu = titlu;
        this.autor = autor;
        this.id = id;
        this.copiiDisponibile = copiiDisponibile;
    }

    public String getTitlu() {
        return titlu;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getId() {
        return id;
    }

    public int getCopiiDisponibile() {
        return copiiDisponibile;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setCopiiDisponibile(int copiiDisponibile) {
        this.copiiDisponibile = copiiDisponibile;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "titlu='" + titlu + '\'' +
                ", autor=" + autor +
                ", id=" + id +
                ", copiiDisponibile=" + copiiDisponibile +
                '}';
    }
}
