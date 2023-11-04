import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int[] bb = arr; //shallow copy
        bb[1] = 500;
        System.out.println(arr[1]);

        int[] cc = arr.clone();
        cc[1] = 100; //deepcopy
        System.out.println(arr[1]);

        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
        }

        for(int el : arr){
            System.out.print(el + " ");
        }

        System.out.println("");

        for(int i = 0; i < arr.length / 2; i++){
            int aux = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = aux;
        }
        for(int el : arr){
            System.out.print(el + " ");
        }

        System.out.println("");
        String s = "Ana are mere";
        char[] sarr = s.toCharArray();

        for(int i = 0; i < sarr.length / 2; i++){
            char aux = sarr[i];
            sarr[i] = sarr[sarr.length - i- 1];
            sarr[sarr.length - i- 1] = aux;
        }

        for(char i: sarr){
            System.out.print(i);
        }

        s = sarr.toString();
    }
}