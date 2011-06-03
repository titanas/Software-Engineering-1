package strategy;

public class PristatymasSunkvežimiu implements PristatymasAutoTransportu {
    
    public PristatymasSunkvežimiu () {
    }

    public float apskaičiuotiKmKainą (int tipas, float svoris) {
        System.out.print("       Kilometro kaina ");
        float kmKaina = 0;

        if (tipas == 1) {
            kmKaina = svoris * 8;
        }
        if (tipas == 2) {
            kmKaina = svoris * 16;
        }
        System.out.println(kmKaina);
        return kmKaina;
    }

    public float nustatytiMuitą (float vertė) {
        System.out.print("       Muito kaina ");
        float muitoKaina = 0;

        if (vertė <= 1000) muitoKaina = vertė * 0.20f;
        else if ((1000 < vertė ) &&(vertė <= 5000)) muitoKaina = vertė * 0.18f;
        else muitoKaina = vertė * 0.16f;
        System.out.println(muitoKaina);
        return muitoKaina;
    }
    
    public float nustatytiPapildomasIšlaidas (float atstumas) {
        System.out.println("       Papildomos išlaidos ");
        float išlaidos;
        išlaidos =+ nustatytiKeliųMokestį(atstumas);
        išlaidos =+ nustatytiTaršosMokestį(atstumas);
        
        return išlaidos;
    }                              

    private float nustatytiKeliųMokestį(float atstumas) {
        System.out.print("          Kelių mokestis ");
        float mokestis = 0;

        mokestis = atstumas / 100;  //mokestis kas 100km.
        System.out.println(mokestis);
        return mokestis;
    }

    private float nustatytiTaršosMokestį(float atstumas) {
        System.out.print("          Taršos mokestis ");
        float mokestis = 0;

        mokestis = 170;
        System.out.println(mokestis);
        return mokestis;     //fiksuotas
    }
}
