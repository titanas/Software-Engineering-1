package templateMethod;

public abstract class AbstractKrovinys {

    private int tipas;
    private float svoris;
    private float vertė;
    private float atstumas;

    public AbstractKrovinys (int tipas, float svoris, float vertė,
            float atstumas) {
        this.tipas = tipas;
        this.svoris = svoris;
        this.vertė = vertė;
        this.atstumas = atstumas;
    }

    abstract protected float apskaičiuotiKmKainą (int tipas, float svoris);
    abstract protected float nustatytiMuitą (float vertė);
    abstract protected float nustatytiPapildomasIšlaidas (float atstumas);

    public float pristatymoKaina() {
        System.out.println("    Pristatymo kaina susideda iš:");
        float kelionėsKaina = apskaičiuotiKmKainą(this.tipas, this.svoris)
                * this.atstumas;
        float muitas = nustatytiMuitą(this.vertė);
        float išlaidos = nustatytiPapildomasIšlaidas(this.atstumas);
        
        return kelionėsKaina + muitas + išlaidos;
    }

    public int getTipas () {
        return this.tipas;
    }

    public float getSvoris () {
        return this.svoris;
    }

     public float getVertė () {
        return this.vertė;
    }

    public float getAtstumas () {
        return this.atstumas;
    }

}
