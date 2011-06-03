package templateMethod;

import java.util.Vector;
import strategy.Laiškas;

public abstract class AbstractPaštoSiunta {

    private int tipas;
    private float atstumas;
    private Vector <Laiškas> laiškai = new Vector<Laiškas>();

    public AbstractPaštoSiunta (int tipas, float atstumas, Vector <Laiškas> laiškai) {
        this.tipas = tipas;
        this.atstumas = atstumas;
        this.laiškai = laiškai;
    }

    abstract protected float apskaičiuotiKmKainą (int tipas, float svoris);
    abstract protected float nustatytiMuitą (float vertė);
    abstract protected float nustatytiPapildomasIšlaidas (float atstumas);

    public float pristatymoKaina() {
        System.out.println("    Pristatymo kaina susideda iš:");
        float kelionėsKaina = apskaičiuotiKmKainą(this.tipas, svoris())
                * this.atstumas;
        float muitas = nustatytiMuitą(vertė());
        float išlaidos = nustatytiPapildomasIšlaidas(this.atstumas);
        
        return kelionėsKaina + muitas + išlaidos;
    }

    public float svoris () {
        float svoris = 0;
        for (int i = 0; i < this.laiškai.size(); i++) {
            svoris =+ this.laiškai.get(i).getSvoris();
        }
        return svoris;
    }

    public float vertė () {
        float kaina = 0;
        for (int i = 0; i < this.laiškai.size(); i++) {
            kaina =+ this.laiškai.get(i).getVertė();
        }
        return kaina;
    }
}
