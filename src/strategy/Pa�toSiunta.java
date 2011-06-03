package strategy;

import java.util.Vector;

public class PaštoSiunta {

    private int tipas;
    private float atstumas;
    private Vector <Laiškas> laiškai = new Vector<Laiškas>();
    private PristatymasAutoTransportu pristatymas;
    
    public PaštoSiunta (int tipas, float atstumas, Vector<Laiškas> laiškai,
            PristatymasAutoTransportu pristatymas) {
        this.tipas = tipas;
        this.atstumas = atstumas;
        this.laiškai = laiškai;
        this.pristatymas = pristatymas;
    }

    public float pristatymoKaina () {
        System.out.println("Pristatymo kaina susideda iš:");
        float kelionėsKaina = this.pristatymas.apskaičiuotiKmKainą(this.tipas, svoris())
                * this.atstumas;
        float muitas = this.pristatymas.nustatytiMuitą(vertė());
        float išlaidos = this.pristatymas.nustatytiPapildomasIšlaidas(this.atstumas);

        return kelionėsKaina + muitas + išlaidos;
    }

    public void pakeistiPristatymą (PristatymasAutoTransportu pristatymas) {
        this.pristatymas = pristatymas;
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

    public void pridėtiLaišką (Laiškas laiškas) {
        this.laiškai.add(laiškas);
    }

    public void šalintiLaišką (Laiškas laiškas) {
        for (int i = 0; i < this.laiškai.size(); i++) {
            if (this.laiškai.get(i).equals(laiškas))
                this.laiškai.remove(i);
        }
    }
    public PristatymasAutoTransportu getPristatymas () {
        return this.pristatymas;
    }
    
    public int getTipas () {
        return this.tipas;
    }

    public float getAtstumas () {
        return this.atstumas;
    }
}
