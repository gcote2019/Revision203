public class Volant implements Envolable {
    private boolean envol = false;
    private final String bruit;

    public Volant(String bruit) {
        this.bruit = bruit;
    }

    public void envoler() {
        if (!envol) {
            if (bruit.isEmpty())
                System.out.println("je m'envole");
            else
                System.out.println(bruit);
            envol = !envol;
        }

    }

    public void atterrir() {
        if (envol) {
            System.out.println("j'atterris");
            envol = !envol;
        }

    }

    public boolean estEnVol() {
        return envol;
    }
}
