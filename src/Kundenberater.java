import java.util.ArrayList;
import java.util.List;

public class Kundenberater {
    private List<Kunde> kunden;

    public Kundenberater() {
        this.kunden = new ArrayList<>();
    }

    public void addKunde(Kunde kunde) {
        kunden.add(kunde);
    }

    public void removeKunde(Kunde kunde) {
        kunden.remove(kunde);
    }

    public List<Kunde> getKunden() {
        return kunden;
    }
}