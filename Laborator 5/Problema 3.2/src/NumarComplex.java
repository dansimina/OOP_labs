public class NumarComplex {
    private int re, im;

    public NumarComplex(){
        this.re = 0;
        this.im = 0;
    }

    public NumarComplex(int re, int im){
        this.re = re;
        this.im = im;
    }

    public NumarComplex adunare(NumarComplex c){
        NumarComplex rezultat = new NumarComplex(this.re, this.im);

        rezultat.re += c.re;
        rezultat.im += c.im;

        return rezultat;
//        return new NumarComplex(this.re + c.re, this.im + c.im);
    }

    public NumarComplex scadere(NumarComplex c){
        return new NumarComplex(this.re - c.re, this.im - c.im);
    }

    public NumarComplex inmultireCuScalar(int scalar){
        return new NumarComplex(this.re * scalar, this.im * scalar);
    }

    public NumarComplex inmultireNumereComplexe(NumarComplex c){
        return new NumarComplex(this.re * c.re - this.im * c.im, this.re * c.im + this.im * c.re);
    }

    public String toString(){
        if(this.im == 0)
            return this.re + "";
        else if(this.re == 0)
            return this.im + "i";
        else
            return this.re + " + " + this.im + "i";
    }

}
