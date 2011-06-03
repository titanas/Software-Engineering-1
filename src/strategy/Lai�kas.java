package strategy;

public class Laiškas {

    private float svoris;
    private float vertė;

    public Laiškas () {
    }

    public Laiškas (float svoris, float vertė) {
        this.svoris = svoris;
        this.vertė = vertė;
    }

    public float getSvoris() {
        return this.svoris;
    }

    public float getVertė() {
        return this.vertė;
    }

}
