public class Poulet extends Oiseau implements Contactable {
    private final Region region;

    public Poulet(Region region) {
        this.region = region;
    }

    @Override
    public String getCourriel() {
        return "pocpocpoc@st-hubert.com";
    }

    // Merci Frédéric
    // https://vitrinelinguistique.oqlf.gouv.qc.ca/23293/la-typographie/nombres/ecriture-et-lecture-des-numeros-de-telephone-courants
    @Override
    public String getTelephone() {
        return region.getCodeRegional()+" 444-1919";
    }
}
