package strategy;

public class Krovinys {

    private int tipas;
    private float svoris;
    private float vertė;
    private float atstumas;
    private PristatymasAutoTransportu pristatymas;
     
    public Krovinys (int tipas, float svoris, float vertė,
            float atstumas, PristatymasAutoTransportu pristatymas) {
        
        this.tipas = tipas;
        this.svoris = svoris;
        this.vertė = vertė;
        this.atstumas = atstumas;
        this.pristatymas = pristatymas;
    }

    // kainos skaičiavimo metodas, kuri naudoja atributo "pristatymas" metodus
    public float pristatymoKaina() {
        System.out.println("    Pristatymo kaina susideda iš:");
        float kelionėsKaina = this.pristatymas.apskaičiuotiKmKainą(this.tipas, this.svoris)
                * this.atstumas;
        float muitas = this.pristatymas.nustatytiMuitą(this.vertė);
        float išlaidos = this.pristatymas.nustatytiPapildomasIšlaidas(this.atstumas);

        return kelionėsKaina + muitas + išlaidos;
    }

    public void pakeistiPristatymą (PristatymasAutoTransportu pristatymas) {
        this.pristatymas = pristatymas;
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

    public PristatymasAutoTransportu getPristatymas () {
        return this.pristatymas;
    }
}
