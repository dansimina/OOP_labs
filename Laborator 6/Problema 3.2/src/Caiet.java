public class Caiet extends Rechizita {
    public Caiet() {
    }

    public Caiet(String eticheta) {
        super(eticheta);
    }

    @Override
    public String getNume() {
        return "Caiet: " + eticheta;
    }
}
