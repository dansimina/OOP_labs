public class Main {
    public static void main(String[] args) {
//        int[] arr = new int[10];
//
//        for(int i = 0; i < arr.length; i++) {
//            arr[i] = i + 1;
//        }
//
//        for (int j : arr) System.out.println(j);
//        SubClasa a = new SubClasa("ceva", 12, true);
//
//        System.out.println(a);
//        a.modifica(76);
//        System.out.println(a);
//        System.out.println(a.getSir());
//        Animal sirAnimale[] = new Animal[4];
//        sirAnimale[0] = new Animal();
//        sirAnimale[1] = new Feline();
//        sirAnimale[2] = new Pisica();
//        sirAnimale[3] = new Caine();
//        for (Animal a : sirAnimale)
//            a.ceMananca();

        String[] s = {"10", "student", "5"};
        for (int i = 0; i <= s.length; i++) {
            try {
                int num = Integer.parseInt(s[i]);
                System.out.println(num);


            } catch (NumberFormatException e) {
                System.out.println("nu e nr");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ai iesit din vector");
            } finally {
                System.out.println("gata boss");
            }
        }

//        int p = 0;
//        try {
//            p = perimetruDreptunghi (2,3,4,5);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(p);
    }

    public static int perimetruDreptunghi(int a, int b, int c, int d) throws Exception {
        if (!esteDreptunghi(a, b, c, d)) throw new IllegalArgumentException(
                String.format("(%d,%d,%d,%d) nu e dreptunghi", a, b, c, d));
        return a + b + c + d;
    }

    static boolean esteDreptunghi(int a, int b, int c, int d) {
        if (a == d && b == c && b == d) return true;
        else if (a == b && c == d) return true;
        else if (a == d && c == b) return true;
        else if (a == c && d == b) return true;
        else return false;
    }
}