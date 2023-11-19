public class BankAccount {
    public static int totalAccounts = 0;
    private int balanta;
    private int id;

    public BankAccount(int sumaInitiala){
        this.id = ++totalAccounts;
        balanta = sumaInitiala;
    }
}
