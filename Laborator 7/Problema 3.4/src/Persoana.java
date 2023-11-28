public class Persoana implements Comparable{
    private String nume;
    private String prenume;
    private Integer varsta;

    public Persoana(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }


    @Override
    public int compareTo(Object o) {
        if(!this.nume.equals(((Persoana) o).nume))
            return this.nume.compareTo(((Persoana) o).nume);
        else
            return this.varsta.compareTo(((Persoana) o).varsta);
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}
