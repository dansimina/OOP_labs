public class Sofer {
    private String nume, prenume;
    private int varsta, numarPermisDeConducere;

    public Sofer() {
    }

    public Sofer(String nume, String prenume, int varsta, int numarPermisDeConducere) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.numarPermisDeConducere = numarPermisDeConducere;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public int getNumarPermisDeConducere() {
        return numarPermisDeConducere;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setNumarPermisDeConducere(int numarPermisDeConducere) {
        this.numarPermisDeConducere = numarPermisDeConducere;
    }

    @Override
    public String toString() {
        return "Sofer{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                ", numarPermisDeConducere=" + numarPermisDeConducere +
                '}';
    }
}
