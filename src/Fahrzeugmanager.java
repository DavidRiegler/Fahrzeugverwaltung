import java.util.ArrayList;
import java.util.List;

public class Fahrzeugmanager {
    private List<Fahrzeug> fahrzeuge;

    public Fahrzeugmanager() {
        this.fahrzeuge = new ArrayList<>();
    }

    public void addFahrzeug(Fahrzeug fahrzeug) {
        fahrzeuge.add(fahrzeug);
    }

    public void removeFahrzeug(Fahrzeug fahrzeug) {
        fahrzeuge.remove(fahrzeug);
    }

    public List<Fahrzeug> getFahrzeuge() {
        return fahrzeuge;
    }
}