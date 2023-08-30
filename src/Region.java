public enum Region {
    MONTREAL(514),
    GRAND_MONTREAL(450),
    QUEBEC(418),
    AUTRE(819);

    private final int codeRegional;
    Region(int codeRegional) {
        this.codeRegional = codeRegional;
    }

    // Merci Rodrigo
    public String getCodeRegional() {return "" + codeRegional;}
}
