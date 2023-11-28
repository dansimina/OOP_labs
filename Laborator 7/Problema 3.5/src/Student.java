public class Student implements Cloneable{
    private String nume;
    private String prenume;
    Masina masina;

    public Student(String nume, String prenume, Masina masina) {
        this.nume = nume;
        this.prenume = prenume;
        this.masina = masina;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setMasina(Masina masina) {
        this.masina = masina;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public Masina getMasina() {
        return masina;
    }

    public Object clone() throws CloneNotSupportedException {
        try {
            Student studentCopie = (Student) super.clone();
            studentCopie.masina = (Masina) masina.clone();

            return studentCopie;
        }
        catch (Exception e) {
            System.out.println("Nu s-a putut clona");
        }

        return null;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", masina=" + masina +
                '}';
    }
}
