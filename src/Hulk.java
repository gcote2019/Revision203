public class Hulk extends SuperHeros {
    public Hulk() {
        super("Hulk", "vert", 40, "Tu me mets en colère");

    }
    @Override
    public void preAttaqueSpeciale() {
        System.out.println("HULK FÂCHÉ!!!!");
        moquer();
        System.out.println("SMASH!!!!");
    }

    @Override
    public void postAttaqueSpeciale() {
        // ne rien faire
    }

}
