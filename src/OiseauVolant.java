public class OiseauVolant extends Oiseau implements Envolable {
    // utiliser la composition
    private Volant volant;

    public OiseauVolant(String criEnvol) {
        volant = new Volant(criEnvol);
    }

    @Override
    public void envoler() {
        volant.envoler();
    }

    @Override
    public void atterrir() {
        volant.atterrir();
    }
}
