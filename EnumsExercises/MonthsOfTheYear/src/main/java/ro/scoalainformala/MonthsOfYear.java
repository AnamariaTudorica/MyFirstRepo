package ro.scoalainformala;

public enum MonthsOfYear {
    IANUARIE("Ianuarie", "Gerar"),
    FEBRUARIE("Februarie", "Faurar"),
    MARTIE("Martie", "Martisor"),
    APRILIE("Aprilie", "Prier"),
    MAI("Mai", "Florar"),
    IUNIE("Iunie", "Ciresar"),
    IULIE("Iulie", "Cuptor"),
    AUGUST("August", "Gustar"),
    SEPTEMBRIE("Septembrie", "Rapciune"),
    OCTOMBRIE("Octombrie", "Brumarel"),
    NOIEMBRIE("Noiembrie", "Brumar"),
    DECEMBRIE("Decembrie", "Undrea/Andrea");

    private MonthsOfYear(String romana, String romana_populara) {
        this.romana = romana;
        this.romana_populara = romana_populara;
    }

    private final String romana;
    private final String romana_populara;

    public String getRomana() {
        return romana;
    }

    public String getRomana_populara() {
        return romana_populara;
    }
}
