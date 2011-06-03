package templateMethod;

public class KrovinysPristatomasSunkvežimiu extends AbstractKrovinys {

    public KrovinysPristatomasSunkvežimiu (int tipas, float svoris, float vertė,
            float atstumas) {
        super(tipas, svoris, vertė, atstumas);
    }

    BendraPristatymasSunkvežimiu bps = new BendraPristatymasSunkvežimiu();

    protected float apskaičiuotiKmKainą (int tipas, float svoris) {
        return bps.apskaičiuotiKmKainą(tipas, svoris);
    }

    protected float nustatytiMuitą (float vertė) {
        return bps.nustatytiMuitą(vertė);
    }
    protected float nustatytiPapildomasIšlaidas (float atstumas) {
        return bps.nustatytiPapildomasIšlaidas(atstumas);
    }
}
