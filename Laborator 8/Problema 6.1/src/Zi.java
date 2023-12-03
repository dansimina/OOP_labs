public class Zi {
    private String nume;
    private boolean lucratoare;

    public Zi() {
    }

    public Zi(String nume, boolean lucratoare) {
        this.nume = nume;
        this.lucratoare = lucratoare;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setLucratoare() {
        lucratoare = true;
    }

    public void setNelucratoare() {
        lucratoare = false;
    }

    public String getNume() {
        return nume;
    }

    public boolean esteLucratoare() {
        return lucratoare;
    }
}
