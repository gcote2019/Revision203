public class Poulet extends Oiseau implements Contactable {
    private final Region region;

    public Poulet(Region region) {
        this.region = region;
    }

    @Override
    public String getCourriel() {
        return "pocpocpoc@st-hubert.com";
    }

    @Override
    public String getTelephone() {
        return region.getCodeRegional()+"-444-1919";
    }
}
