public class FabriqueDeSuperHeros {
    public static SuperHeros creer(String nom) throws ExceptionInInitializerError {
        if (nom.equals("Superman")) {
            return new Superman();
        } else if (nom.equals("Hulk")) {
            return new Hulk();
        } else if (nom.equals("Ironman")) {
            return new Ironman();
        } else {
            throw new ExceptionInInitializerError();
        }
    }
    public static SuperHeros creer(TypeSuperHeros type) throws ExceptionInInitializerError {
        SuperHeros superHeros = switch (type) {
            case SUPERMAN -> new Superman();
            case HULK -> new Hulk();
            default -> new Ironman();
        };
        return superHeros;
    }
}
