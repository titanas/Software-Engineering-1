package templateMethod;

public class KrovinysPristatomasAutomobiliu extends AbstractKrovinys {

    public KrovinysPristatomasAutomobiliu (int tipas, float svoris, float vertė,
            float atstumas) {
        super(tipas, svoris, vertė, atstumas);
    }

    BendraPristatymasAutomobiliu bpa = new BendraPristatymasAutomobiliu();

    public float apskaičiuotiKmKainą (int tipas, float svoris) {
        return bpa.apskaičiuotiKmKainą(tipas, svoris);
    }

    public float nustatytiMuitą (float vertė) {
        return bpa.nustatytiMuitą(vertė);
    }
    
    public float nustatytiPapildomasIšlaidas (float atstumas) {
        return bpa.nustatytiPapildomasIšlaidas(atstumas);
    }
}
