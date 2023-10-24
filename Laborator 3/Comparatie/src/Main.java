public class Main {
    public static void main(String[] args) {
        if(0.1 + 0.1 + 0.1 == 0.3){
            System.out.print("Egal");
        }
        else System.out.println(0.1 + 0.1 + 0.1);

        double epsilon = 0.000001;

        if(Math.abs((0.1 + 0.1 + 0.1) - 0.3) < epsilon){
            System.out.print("Egal");
        }
    }
}