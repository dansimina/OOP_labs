public class Autobuz extends Autovehicul{
    int ruta;

    public Autobuz(int vMaxima){
        super(new Sofer());
        vitezaMaxima = vMaxima;
    }

    double accelerare(int delta){
        vitezaCurenta += delta;
        return vitezaCurenta;
    }
}
