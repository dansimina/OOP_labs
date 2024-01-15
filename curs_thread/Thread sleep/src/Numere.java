public class Numere {
    public void negative(int k) {
        for(int i = -k, cnt = 0; i < 0; i++, cnt++) {
            System.out.println("Nr negative: " + i);
            if(cnt == 2) {
                try{
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    System.out.println("Exceptie Tratata");
                }
            }
        }
    }

    public void pozitive(int k) {
        for(int i = 0; i < k; i++) {
            System.out.println("nr pozitive: " + i);
        }
    }
}
