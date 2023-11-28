public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student unu = new Student("unu", "unu", new Masina("mercedes", "argintiu", new Cutie("automata")));
        Student doi = (Student) unu.clone();

        System.out.println(unu);
        System.out.println(doi);

        doi.masina.setCuloare("negtu");
        System.out.println(unu);
        System.out.println(doi);

        doi.setNume("doi");
        doi.setPrenume("doi");
        System.out.println(unu);
        System.out.println(doi);
    }
}