public class Ironman extends SuperHerosVolant {
    private final String couleurSecondaire = "or";


    public Ironman() {
        super("Ironman", "rouge", 20, SuperHeros.PHRASE_MOQUEUSE_PAR_DEFAUT, "Ironman vole");
    }
    @Override
    public void preAttaqueSpeciale() {
        for (int i = 0; i < 5; i++) {
            System.out.println("J’ai plein de fric et je me la pète!!!");
        }
        moquer();
    }

    @Override
    public void postAttaqueSpeciale() {
        // ne rien faire
    }

}