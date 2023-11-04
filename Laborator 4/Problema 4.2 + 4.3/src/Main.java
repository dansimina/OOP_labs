import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Autovehicul a1 = new Autovehicul();

        a1.setMarca("Audi");

        a1.setCuloare(Color.BLACK);
        System.out.println(a1.getCuloare());

        a1.accelerare(120.15);
        System.out.println(a1.getVitezaCurenta());

        a1.accelerare(200.32);
        System.out.println(a1.getVitezaCurenta());

        a1.decelerare(60.45);
        System.out.println(a1.getVitezaCurenta());

        a1.decelerare(240);
        System.out.println(a1.getVitezaCurenta());

        a1.schimbaTreapta(3);

        System.out.println(a1);

        Autovehicul a2 = new Autovehicul("Mercedes", Color.MAGENTA, 50.5, 3);

        System.out.println(a2.getCuloare());

        a2.schimbaTreapta(5);
        System.out.println(a2.getTreaptaDeVitezaCurenta());

        a2.schimbaTreapta(-1);
        System.out.println(a2.getTreaptaDeVitezaCurenta());

        a2.schimbaTreapta(10);
        System.out.println(a2.getTreaptaDeVitezaCurenta());

        a2.schimbaTreapta(1);
        System.out.println(a2.getTreaptaDeVitezaCurenta());

        a2.oprire();
        System.out.println(a2.getVitezaCurenta());
        System.out.println(a2.getTreaptaDeVitezaCurenta());

        a2.sofer = new Sofer("Popa", "Ionel", 20, 31231);
        System.out.println(a2);


    }
}