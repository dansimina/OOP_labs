public class Manual extends Rechizita {
    public Manual() {
    }

    public Manual(String eticheta) {
        super(eticheta);
    }

    @Override
    public String getNume() {
        return "Manual: " + super.eticheta;
    }
}
