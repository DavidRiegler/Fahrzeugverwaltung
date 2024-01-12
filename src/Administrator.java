public class Administrator {
    private Fahrzeugmanager fahrzeugmanager;
    private Kundenberater kundenberater;

    public Administrator() {
        this.fahrzeugmanager = new Fahrzeugmanager();
        this.kundenberater = new Kundenberater();
    }

    public Fahrzeugmanager getFahrzeugmanager() {
        return fahrzeugmanager;
    }

    public Kundenberater getKundenberater() {
        return kundenberater;
    }
}