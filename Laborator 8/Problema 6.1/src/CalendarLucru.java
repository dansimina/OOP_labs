public class CalendarLucru {
    static final int NUMAR_MAXIM_ZILE = 7;
    private Zi[] zile = new Zi[NUMAR_MAXIM_ZILE];

    public CalendarLucru() {
        zile[0] = new Zi("Luni", true);
        zile[1] = new Zi("Marti", true);
        zile[2] = new Zi("Miercuri", true);
        zile[3] = new Zi("Joi", true);
        zile[4] = new Zi("Vineri", true);
        zile[5] = new Zi("Sambata", false);
        zile[6] = new Zi("Duminica", false);
    }

    public Zi getZi(String nume) {
        for(int i = 0; i < NUMAR_MAXIM_ZILE; i++) {
            if(nume.compareToIgnoreCase(zile[i].getNume()) == 0) {
                return zile[i];
            }
        }
        return null;
    }
}
