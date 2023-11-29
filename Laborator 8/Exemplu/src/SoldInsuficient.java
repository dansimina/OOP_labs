public class SoldInsuficient extends Exception{
    public SoldInsuficient() {
        super();
    }
    public SoldInsuficient(String mesaj) {
        super(mesaj);
    }

}
/*
void retrageNumerar(int amount) throws SoldInsuficient{
    if(this.sold < amount) {
        throw new SoldInsuficient("n-ai bani");
    }
}
 */