// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        NumarComplex a = new NumarComplex(2, 3);
        NumarComplex b = new NumarComplex(3, 2);

        System.out.println(a + "\n" + b + "\n");
//
//        a = a.adunare(b);
//        System.out.println(a + "\n" + b + "\n");
//
//        a = a.scadere(b);
//        System.out.println(a + "\n" + b + "\n");
//
//        a = a.inmultireCuScalar(3);
//        System.out.println(a + "\n" + b + "\n");
//
//        a = a.scadere(a);
//        System.out.println(a + "\n" + b + "\n");
//
//        b = b.scadere(new NumarComplex(3, 0));
//        System.out.println(a + "\n" + b + "\n");

//        a = a.inmultireNumereComplexe(b);
//        System.out.println(a);

        int nrR = 3, nrC = 3;
        NumarComplex[][] m11 = new NumarComplex[nrR][nrC];
        for (int i = 0; i < nrR; i++) {
            for (int j = 0; j < nrC; j++)
                m11[i][j] = new NumarComplex(i, j);
        }

        NumarComplex[][] m22 = new NumarComplex[nrR][nrC];
        for (int i = 0; i < nrR; i++) {
            for (int j = 0; j < nrC; j++)
                m22[i][j] = new NumarComplex(j, i);
        }

        MatriceNumereComplexe m1 = new MatriceNumereComplexe(nrR, nrC, m11);
        MatriceNumereComplexe m2 = new MatriceNumereComplexe(nrR, nrC, m22);


        System.out.println(m1);
        System.out.println(m2);

//        m1 = m1.adunare(m2);
//        System.out.println(m1);
//
//        m1 = m1.scadere(m2);
//        System.out.println(m1);
//
//        m1 = m1.inmultireScalar(2);
//        System.out.println(m1);

        m1 = m1.inmultireMatrice(m2);
        System.out.println(m1);
    }
}