public abstract class SuperHerosVolant extends SuperHeros implements Envolable {
    private final Volant volant;
    public SuperHerosVolant(String nom, String couleurPrincipale, int forceAttaque, String phraseMoqueuse, String criEnvol) {
        super(nom, couleurPrincipale, forceAttaque, phraseMoqueuse);
        volant = new Volant(criEnvol);
    }

    public void envoler() {
        volant.envoler();
    }
    public void atterrir() {
        volant.atterrir();
    }

}
