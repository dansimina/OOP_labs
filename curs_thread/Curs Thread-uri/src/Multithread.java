public class Multithread extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("Thread " + this.getId() + " ruleaza");
        }
        catch (Exception e) {
            System.out.println("Exceptie prinsa!");
        }
    }
}
