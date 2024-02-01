public class SuperClasa {
    private String sir;
    protected int numar;

    public SuperClasa(String sir, int numar) {
        this.sir = sir;
        this.numar = numar;
    }

    public String getSir() {
        return sir;
    }

    public int getNumar() {
        return numar;
    }

    public void setSir(String sir) {
        this.sir = sir;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }
}
