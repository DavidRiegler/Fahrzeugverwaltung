public abstract class Fahrzeug {
    private String marke;
    private String modell;

    public Fahrzeug(String marke, String modell) {
        this.marke = marke;
        this.modell = modell;
    }

    public String getMarke() {
        return marke;
    }

    public String getModell() {
        return modell;
    }
}
