public class Fahrzeugverwaltung {
    public static void main(String[] args) {
        Administrator administrator = new Administrator();

        Fahrzeug fahrzeug1 = new Fahrzeug("VW", "Golf");
        Fahrzeug fahrzeug2 = new Fahrzeug("BMW", "X5");

        Kunde kunde1 = new Kunde("Max Mustermann");
        kunde1.addFahrzeug(fahrzeug1);

        Kunde kunde2 = new Kunde("Erika Musterfrau");
        kunde2.addFahrzeug(fahrzeug2);

        administrator.getFahrzeugmanager().addFahrzeug(fahrzeug1);
        administrator.getFahrzeugmanager().addFahrzeug(fahrzeug2);

        administrator.getKundenberater().addKunde(kunde1);
        administrator.getKundenberater().addKunde(kunde2);

        // Beispiel: Alle Fahrzeuge eines Kunden ausgeben
        for (Kunde kunde : administrator.getKundenberater().getKunden()) {
            System.out.println("Kunde: " + kunde.getName());
            for (Fahrzeug fahrzeug : kunde.getFahrzeuge()) {
                System.out.println("Fahrzeug: " + fahrzeug.getMarke() + " " + fahrzeug.getModell());
            }
        }
    }
}
