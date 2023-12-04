public class Carte implements Comparable<Carte>{
    private String titlu;
    private Persoana autor;
    private int anAparitie;
    private String editura;

    public Carte() {
    }

    public Carte(String titlu, Persoana autor, int anAparitie, String editura) {
        this.titlu = titlu;
        this.autor = autor;
        this.anAparitie = anAparitie;
        this.editura = editura;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public void setAutor(Persoana autor) {
        this.autor = autor;
    }

    public void setAnAparitie(int anAparitie) {
        this.anAparitie = anAparitie;
    }

    public void setEditura(String editura) {
        this.editura = editura;
    }

    public String getTitlu() {
        return titlu;
    }

    public Persoana getAutor() {
        return autor;
    }

    public int getAnAparitie() {
        return anAparitie;
    }

    public String getEditura() {
        return editura;
    }

    @Override
    public int compareTo(Carte o) {
        return this.getEditura().compareTo(o.getEditura());
    }

    @Override
    public String toString() {
        return "Carte{" +
                "titlu='" + titlu + '\'' +
                ", autor=" + autor +
                ", anAparitie=" + anAparitie +
                ", editura='" + editura + '\'' +
                '}';
    }
}
