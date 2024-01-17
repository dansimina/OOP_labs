public class Abonament {
    private int idAbonament;
    private String tipAbonament;

    public Abonament() {
    }

    public Abonament(int idAbonament, String tipAbonament) {
        this.idAbonament = idAbonament;
        this.tipAbonament = tipAbonament;
    }

    public void vizioneazaFilm(String numeFilm) {

    }

    public int getIdAbonament() {
        return idAbonament;
    }

    public String getTipAbonament() {
        return tipAbonament;
    }

    public void setIdAbonament(int idAbonament) {
        this.idAbonament = idAbonament;
    }

    public void setTipAbonament(String tipAbonament) {
        this.tipAbonament = tipAbonament;
    }

    @Override
    public String toString() {
        return "Abonament{" +
                "idAbonament=" + idAbonament +
                ", tipAbonament='" + tipAbonament + '\'' +
                '}';
    }
}
