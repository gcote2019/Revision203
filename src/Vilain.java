public class Vilain extends Personne {
    private final String nom;
    private final int forceDefense;

    public Vilain(String nom, int forceDefense) {
        this.nom = nom;
        this.forceDefense = forceDefense;
    }

    public String getNom() {
        return nom;
    }

    public int getForceDefense() {
        return forceDefense;
    }

    @Override
    public String toString() {
        return nom;
    }
}
