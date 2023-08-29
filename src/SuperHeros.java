public abstract class SuperHeros {
    public static final String PHRASE_MOQUEUSE_PAR_DEFAUT = "Mon père court plus vite que le tien!";
    private final String nom;
    private final String couleurPrincipale;
    private int forceAttaque;
    private final String phraseMoqueuse;




    public SuperHeros(String nom, String couleurPrincipale, int forceAttaque, String phraseMoqueuse) {
        this.nom = nom;
        this.couleurPrincipale = couleurPrincipale;
        this.forceAttaque = forceAttaque;
        this.phraseMoqueuse = phraseMoqueuse;

    }

    /* La classe est maintenant abstraite, je ne peux plus l'utiliser
    il faudrait utiliser des enums
    public static SuperHeros creer(String nom) {
        if (nom.equals("Superman")) {
            return new SuperHeros("Superman", "bleu", "rouge", 25, "Je suis l'homme d'acier");
        } else if (nom.equals("Hulk")) {
            return new SuperHeros("Hulk", "vert", 40, "Tu me mets en colère");
        } else if (nom.equals("Ironman")) {
            return new SuperHeros("Ironman", "rouge", "or", 20);
        } else {
            throw new ExceptionInInitializerError();
        }
    }
     */

    public void moquer() {
        System.out.println(phraseMoqueuse);
    }

    public void sauver(Personne personne) {
        System.out.println("Je sauve une personne!");
    }

    public String getNom() {
        return nom;
    }

    public int getForceAttaque() {
        return forceAttaque;
    }

    @Override
    public String toString() {
        return getNom();
    }

    // quand même, celle-là est assez évidente, je ne vais pas répêter 3 fois ce code
    public void attaquer(Vilain vilain) {
        if (vilain.getForceDefense() >= getForceAttaque()) {
            System.out.println(this + " attaque " + vilain + " mais ne fait aucun dommage");
        } else {
            System.out.println(this + " attaque " + vilain + " pour " + (getForceAttaque() - vilain.getForceDefense()) + " points de dommage");
        }
    }

    public void attaquer(Personne personne) {
        System.out.println("OH NON!");
    }

    public abstract void preAttaqueSpeciale();
    public abstract void postAttaqueSpeciale();

    public void attaqueSpeciale() {
        preAttaqueSpeciale();
        forceAttaque += 5;
        postAttaqueSpeciale();
    }

}
