public class Autovehicul {
    Sofer sofer;
    double vitezaMaxima;
    double vitezaCurenta;

    public Autovehicul() {
    }

    public Autovehicul(Sofer sofer){
        this.sofer = sofer;
    }

    void accelerare(double delta){
        vitezaCurenta += delta;
    }
}
