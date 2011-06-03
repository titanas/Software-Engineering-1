package templateMethod;

import java.util.Vector;
import strategy.Laiškas;

public class PaštoSiuntaPristatomaAutomobiliu extends AbstractPaštoSiunta {

    public PaštoSiuntaPristatomaAutomobiliu (int tipas, float atstumas,
            Vector<Laiškas> laiškai) {
        super(tipas, atstumas, laiškai);
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
