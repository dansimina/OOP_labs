public class Cutie implements Cloneable{
    private String cutie;

    public Cutie(String cutie) {
        this.cutie = cutie;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Cutie{" +
                "cutie='" + cutie + '\'' +
                '}';
    }
}
