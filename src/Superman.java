public class Superman extends SuperHerosVolant {
    private final String couleurSecondaire = "rouge";
    public Superman() {
        super("Superman", "bleu", 25, "Je suis l'homme d'acier", "Je suis Superman et je m'envole");
    }

    @Override
    public void preAttaqueSpeciale() {
        moquer();
        // afficher "Yeux au laser"
    }

    @Override
    public void postAttaqueSpeciale() {
        // ne rien faire
    }
}