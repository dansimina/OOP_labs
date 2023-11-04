public class Rezervor {
    double capacitateMaxima;
    double nivelCurentDeUmplere;

    public Rezervor() {
        this.capacitateMaxima = 50;
    }

    public Rezervor(double nivelCurentDeUmplere) {
        this.capacitateMaxima = 50;

        if(nivelCurentDeUmplere >= 0 && nivelCurentDeUmplere <= this.capacitateMaxima)
            this.nivelCurentDeUmplere = nivelCurentDeUmplere;
    }

    public double getNivelCurentDeUmplere() {
        return nivelCurentDeUmplere;
    }

    public void umplere(double cantitate) {
        cantitate = Math.abs(cantitate);
        if (this.nivelCurentDeUmplere + cantitate <= this.capacitateMaxima)
            this.nivelCurentDeUmplere += cantitate;
    }

    public void golire(double cantitate) {
        cantitate = Math.abs(cantitate);
        if (this.nivelCurentDeUmplere - cantitate >= 0)
            this.nivelCurentDeUmplere -= cantitate;
    }
}
