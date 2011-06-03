package templateMethod;

public class BendraPristatymasAutomobiliu {

    public float apskaičiuotiKmKainą (int tipas, float svoris) {
        System.out.print("       Kilometro kaina ");
        float kmKaina = 0;

        if (tipas == 1) {
            kmKaina = svoris * 3;
        }
        if (tipas == 2) {
            kmKaina = svoris * 6;
        }
        System.out.println(kmKaina);
        return kmKaina;
    }

    public float nustatytiMuitą (float vertė) {
        System.out.print("       Muito kaina ");
        float muitoKaina = 0;

        if (vertė <= 1000) muitoKaina =  vertė * 0.20f;
        else if ((1000 < vertė ) &&(vertė <= 5000)) muitoKaina = vertė * 0.18f;
             else muitoKaina = vertė * 0.16f;
        System.out.println(muitoKaina);
        return muitoKaina;
    }

    public float nustatytiPapildomasIšlaidas (float atstumas) {
        System.out.print("       Papildomos išlaidos ");
        float išlaidos = 0;

        System.out.println(išlaidos);
        return išlaidos;
    }

}
