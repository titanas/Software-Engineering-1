package templateMethod;

import java.util.Vector;
import strategy.Laiškas;

public class PaštoSiuntaPristatomaSunkvežimiu extends AbstractPaštoSiunta{

    public PaštoSiuntaPristatomaSunkvežimiu (int tipas, float atstumas,
            Vector<Laiškas> laiškai) {
        super(tipas, atstumas, laiškai);
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