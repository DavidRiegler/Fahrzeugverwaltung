import java.util.ArrayList;
import java.util.List;

class Kunde {
    private String name;
    private List<Fahrzeug> fahrzeuge;

    public Kunde(String name) {
        this.name = name;
        this.fahrzeuge = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Fahrzeug> getFahrzeuge() {
        return fahrzeuge;
    }

    public void addFahrzeug(Fahrzeug fahrzeug) {
        fahrzeuge.add(fahrzeug);
    }
}



