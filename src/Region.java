public enum Region {
    MONTREAL("514"),
    GRAND_MONTREAL("450"),
    QUEBEC("418"),
    AUTRE("819");

    private final String codeRegional;
    Region(String codeRegional) {
        this.codeRegional = codeRegional;
    }

    public String getCodeRegional() {return codeRegional;}
}
