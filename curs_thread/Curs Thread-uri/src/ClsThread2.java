public class ClsThread2 implements Runnable{
    @Override
    public void run() {
        try {
            for(int i = 0; i < 100; i++)
            System.out.println(i + " Thread " + Thread.currentThread().getName() + " ruleaza!");
        }
        catch (Exception e) {
            System.out.println("Exceptie prinsa!");
        }
    }
}
