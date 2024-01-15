public class Main {
    public static void main(String[] args) {
        int p = 10;
        Numere obj = new Numere();
        Thread t1 = new Thread(new Runnable(){

            @Override
            public void run() {
                obj.negative(p);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.pozitive(p);
            }
        });

        t1.start();
        t1.interrupt();
        t2.start();
    }
}