package psi_1;

import java.util.Vector;
import strategy.*;
import templateMethod.*;

public class Main {

    public static void main(String[] args) {

        // Įvedimo duomenys (Kroviniui, vėliau Pašto Siuntai)
        int tipas = 1;
        float svoris = 120;
        float vertė = 3400;
        float atstumas = 1250;

        // Išorinis klientas
        Siuntėjas siuntėjas = new Siuntėjas();

        // Objektų varijavimas
        System.out.println("**************Strategy pavyzdys**************");
        siuntėjas.siūstiKrovinį( new Krovinys(tipas, svoris, vertė, atstumas,
                new PristatymasAutomobiliu()) );

        PristatymasSunkvežimiu pristSunk = new PristatymasSunkvežimiu();
        siuntėjas.siūstiKrovinį(new Krovinys(tipas, svoris, vertė, atstumas,
               pristSunk));

        System.out.println("*************Template method pavyzdys**************");
        siuntėjas.siūstiKrovinįPristatomąAutomobiliu(
                new KrovinysPristatomasAutomobiliu(tipas, svoris, vertė, atstumas));
                
        siuntėjas.siūstiKrovinįPristatomąSunkvežimiu(
               new KrovinysPristatomasSunkvežimiu(tipas, svoris, vertė, atstumas));

        System.out.println("Atsiranda NAUJA esybė - pašto siunta");

        // Nauja esybė turi kompozicijos būdu Laiškų sąrašą
        Vector<Laiškas> laiškai = new Vector<Laiškas>();
        laiškai.add(new Laiškas((float) 0.340, (float) 2.50));
        laiškai.add(new Laiškas((float) 1.530, (float) 25.43));

        System.out.println("**************Strategy pavyzdys**************");

        PaštoSiunta paštoSiunta = new PaštoSiunta (tipas, atstumas, laiškai,
                new PristatymasAutomobiliu());
        siuntėjas.siūstiPaštoSiuntą(paštoSiunta);

        System.out.println("Pakeičiame dinamiškai pašto siuntos esybės pristatymo būdą");
        paštoSiunta.pakeistiPristatymą(pristSunk);      //pristatymas bus sunkvežimiu
        siuntėjas.siūstiPaštoSiuntą(paštoSiunta);

        System.out.println("*************Template method pavyzdys 2. Naują esybę extendinant AbstractPaštoSiunta **************");

        siuntėjas.siūstiPaštoSiuntąPristatomąAutomobiliu2(
                new PaštoSiuntaPristatomaAutomobiliu(tipas, atstumas, laiškai));

        siuntėjas.siūstiPaštoSiuntąPristatomąSunkvežimiu2(
                new PaštoSiuntaPristatomaSunkvežimiu(tipas, atstumas, laiškai));
    }

    public static float apskaičiuotiLaiškųSvorį(Vector<Laiškas> laiškai) {
        float svoris = 0;
        for (int i = 0; i < laiškai.size(); i++) {
            svoris =+ laiškai.get(i).getSvoris();
        }
        return svoris;
    }

    public static float apskaičiuotilaiškųVertę (Vector<Laiškas> laiškai) {
        float kaina = 0;
        for (int i = 0; i < laiškai.size(); i++) {
            kaina =+ laiškai.get(i).getVertė();
        }
        return kaina;
    }
}
