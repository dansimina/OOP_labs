public class Main {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i < n; i++) {
//            Multithread obj = new Multithread();
//            obj.start();
            Thread obj2 = new Thread(new ClsThread2());
            obj2.setName("Nume-" + i);
            obj2.start();
        }
        System.out.println("gata");
    }
}