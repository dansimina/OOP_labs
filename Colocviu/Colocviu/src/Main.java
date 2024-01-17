public class Main {
    public static void main(String[] args) {
        ServiciuStreamingFilme serviciuStreamingFilme = new ServiciuStreamingFilme();

        Film film1 = new Film("film1", "Comedie", 30, true);
        Film film2 = new Film("film2", "Comedie", 45, true);
        Film film3 = new Film("film3", "Drama", 60, false);
        Film film4 = new EpisodSerial("film4", "Drama", 75, true, 3, 10);
        Film film5 = new EpisodSerial("film5", "Comedie", 30, true, 2, 5);

        serviciuStreamingFilme.adaugaFilm(film1);
        serviciuStreamingFilme.adaugaFilm(film2);
        serviciuStreamingFilme.adaugaFilm(film3);
        serviciuStreamingFilme.adaugaFilm(film4);
        serviciuStreamingFilme.adaugaFilm(film5);

        Abonament standard = new Abonament(1, "standard");
        Abonament premium = new Abonament(2, "Premium");

        Abonat abonat1 = new Abonat("abonat1", standard);
        Abonat abonat2 = new Abonat("abonat2", premium);
        Abonat abonat3 = new Abonat("abonat3", standard);

        serviciuStreamingFilme.adaugaAbonat(abonat1);
        serviciuStreamingFilme.adaugaAbonat(abonat2);
        serviciuStreamingFilme.adaugaAbonat(abonat3);

        System.out.println(serviciuStreamingFilme);

        System.out.println("\nNumar filme comedie: " + serviciuStreamingFilme.getNumarFilmeComedie());

        try {
            Film filmDeVazut1 = serviciuStreamingFilme.cautaFilm("film1");
            System.out.println("\n" + filmDeVazut1);
            abonat1.vizioneazaFilm(filmDeVazut1);
        } catch (FilmIndisponibilException e) {
            System.out.println("\n" + e);
        }

        System.out.println("\n" + abonat1);

        try {
            Film filmDeVazut2 = serviciuStreamingFilme.cautaFilm("film2");
            abonat1.adaugaFilmInWishList(filmDeVazut2);
        } catch (FilmIndisponibilException e) {
            System.out.println("\n" + e);
        } catch (PremiumNotEnabledException e) {
            System.out.println("\n" + e);
        }

        System.out.println("\n" + abonat1);

        try {
            Film filmDeVazut3 = serviciuStreamingFilme.cautaFilm("film2");
            abonat2.adaugaFilmInWishList(filmDeVazut3);
        } catch (FilmIndisponibilException e) {
            System.out.println("\n" + e);
        } catch (PremiumNotEnabledException e) {
            System.out.println("\n" + e);
        }

        System.out.println("\n" + abonat2);

        try {
            Film filmDeVazut4 = serviciuStreamingFilme.cautaFilm("film2");
            abonat2.vizioneazaFilm(filmDeVazut4);
        } catch (FilmIndisponibilException e) {
            System.out.println("\n" + e);
        }

        System.out.println("\n" + abonat2);

        abonat1.setAbonament(premium);

        System.out.println("\n" + abonat1);

        serviciuStreamingFilme.stergeFilm("film5");
        serviciuStreamingFilme.stergeAbonat("abonat3");

        System.out.println("\nNumar filme comedie: " + serviciuStreamingFilme.getNumarFilmeComedie());

        System.out.println("\n" + serviciuStreamingFilme);
    }
}