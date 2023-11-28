public class Masina implements Cloneable{
    private String marca;
    private String culoare;

    private Cutie cutie;

    public Masina(String marca, String culoare, Cutie cutie) {
        this.marca = marca;
        this.culoare = culoare;
        this.cutie = cutie;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getMarca() {
        return marca;
    }

    public String getCuloare() {
        return culoare;
    }

    public Cutie getCutie() {
        return cutie;
    }

    public Object clone() throws CloneNotSupportedException {
        try {
            Masina masinaCopie = (Masina) super.clone();
            masinaCopie.cutie = (Cutie) cutie.clone();

            return masinaCopie;
        }
        catch (Exception e){
            System.out.println("Nu s-a putu clona");
        }
        return null;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "marca='" + marca + '\'' +
                ", culoare='" + culoare + '\'' +
                ", cutie=" + cutie +
                '}';
    }
}
