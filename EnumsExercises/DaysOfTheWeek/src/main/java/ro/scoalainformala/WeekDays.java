package ro.scoalainformala;

public enum WeekDays {
    Luni("Luni", "Monday", "Lunes"),
    Marti("Marti", "Tuesday", "Martes"),
    Miercuri("Miercuri", "Wednesday", "Miercoles"),
    Joi("Joi", "Thursday", "Jueves"),
    Vineri("Vineri", "Friday", "Viernes"),
    Sambata("Sambata", "Saturday", "Sabado"),
    Duminica("Duminica", "Sunday", "Domingo");

    WeekDays(String romanian, String english, String spanish) {
        this.romanian=romanian;
        this.english=english;
        this.spanish=spanish;
    }
    private final String romanian;
    private final String english;
    private final String spanish;

    public String getRomanian() {
        return this.romanian;
    }
    public String getSpanish() {
        return this.spanish;
    }
    public String getEnglish() {
        return this.english;
    }

}


