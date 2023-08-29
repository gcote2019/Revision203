public class Main {
    public static void main(String[] args) {
        SuperHeros[] groupeDeSuperHeros = new SuperHeros[3];
        int pos = 0;
        groupeDeSuperHeros[pos++] = FabriqueDeSuperHeros.creer(TypeSuperHeros.SUPERMAN);
        groupeDeSuperHeros[pos++] = FabriqueDeSuperHeros.creer(TypeSuperHeros.HULK);
        groupeDeSuperHeros[pos++] = FabriqueDeSuperHeros.creer(TypeSuperHeros.IRONMAN);

        Vilain[] groupeDeVilains = new Vilain[2];
        pos = 0;
        groupeDeVilains[pos++] = new Vilain("Loki", 18);
        groupeDeVilains[pos++] = new Vilain("Venom", 15);

        for (SuperHeros superHeros: groupeDeSuperHeros 
             ) {
            // envoler et atterrir ne font plus partie de SuperHeros
            //superHeros.envoler();
            //superHeros.atterrir();
            superHeros.moquer();
            for (Vilain vilain: groupeDeVilains
                 ) {
                //superHeros.envoler();
                superHeros.attaquer(vilain);
                //superHeros.atterrir();
            }

        }

        // utilisez Poulet.creer(Region)
        Poulet poulet = new Poulet(Region.QUEBEC);
        appeler(poulet);
    }

    private static void appeler(Contactable c) {
        System.out.println("On compose le " + c.getTelephone());
        System.out.println("*dring dring*");
        System.out.println("Personne à l'appareil");
        System.out.println("on va plutôt écrire au " + c.getCourriel());
    }
}