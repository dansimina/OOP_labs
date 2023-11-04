import java.awt.*;

public class Autovehicul {
    private String marca;
    private Color culoare;
    private double vitezaCurenta, vitezaMaxima;
    private int treaptaDeVitezaCurenta, numarTrepteViteza;

    Sofer sofer;

    public Autovehicul() {
        this.vitezaMaxima = 300;
        this.numarTrepteViteza = 6;
    }

    public Autovehicul(String marca, Color culoare, double vitezaCurenta, int treaptaDeVitezaCurenta) {
        this.vitezaMaxima = 300;
        this.numarTrepteViteza = 6;

        this.marca = marca;
        this.culoare = culoare;
        if(vitezaCurenta >= 0 && vitezaCurenta <= this.vitezaMaxima)
            this.vitezaCurenta = vitezaCurenta;
        if(treaptaDeVitezaCurenta >= 0 && treaptaDeVitezaCurenta <= this.numarTrepteViteza)
            this.treaptaDeVitezaCurenta = treaptaDeVitezaCurenta;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Color getCuloare() {
        return culoare;
    }

    public void setCuloare(Color culoare) {
        this.culoare = culoare;
    }

    public double getVitezaCurenta() {
        return this.vitezaCurenta;
    }

    public int getTreaptaDeVitezaCurenta() {
        return this.treaptaDeVitezaCurenta;
    }

    public void accelerare(double delta) {
        delta = Math.abs(delta);
        if (this.vitezaCurenta + delta < this.vitezaMaxima)
            this.vitezaCurenta += delta;
    }

    public void decelerare(double delta) {
        delta = Math.abs(delta);
        if (this.vitezaCurenta - delta >= 0) {
            this.vitezaCurenta -= delta;
        }
    }

    public void oprire() {
        this.vitezaCurenta = 0;
        this.treaptaDeVitezaCurenta = 0;
    }

    public void schimbaTreapta(int treaptaDeViteza) {
        if (treaptaDeViteza >= 0 && treaptaDeViteza <= numarTrepteViteza) {
            this.treaptaDeVitezaCurenta = treaptaDeViteza;
        }
    }

    @Override
    public String toString() {
        return "Marca: " + this.marca + " Culoare: " + this.culoare.toString() + " Viteza: " + this.vitezaCurenta + " Treapta: " + this.treaptaDeVitezaCurenta + " Sofer: " + this.sofer;
    }

    public Sofer getSofer() {
        return this.sofer;
    }

    public void setSofer(Sofer sofer) {
        this.sofer = sofer;
    }
}
