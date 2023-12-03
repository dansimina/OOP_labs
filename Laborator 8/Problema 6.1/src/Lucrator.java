public class Lucrator {
    private String nume;
    CalendarLucru calendar = new CalendarLucru();

    public Lucrator(String nume) {
        this.nume = nume;
    }

    public void lucreaza(String numeZi) throws ExceptieZiNelucratoare {
        Zi zi = calendar.getZi(numeZi);
        if(zi == null) {
            throw new ExceptieZiNelucratoare(numeZi + " nu este o zi a saptamanii");
        }
        else if(zi.esteLucratoare() == true) {
            System.out.println(nume + " lucreaza " + zi.getNume());
        }
        else {
            throw new ExceptieZiNelucratoare("Exceptie: lucru in zi nelucratoare");
        }
    }
}
