public class SubClasa extends SuperClasa{
    private boolean ok;
    public SubClasa(String sir, int numar, boolean ok) {
        super(sir, numar);
        this.ok = ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public boolean getOk() {
        return ok;
    }

    public void modifica(int n) {
        numar = n;
    }

    @Override
    public String toString() {
        return "SubClasa{" +
                "sir =" + super.getSir() +
                ", ok=" + ok +
                ", numar=" + numar +
                '}';
    }
}
