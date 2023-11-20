package ro.scoalainformala;
//model the days of the week; store for each day its name in English, Romanian and Spanish
public class Main {
    public static void main(String[] args) {

        System.out.print("Romanian:\t");
        for (WeekDays day : WeekDays.values()) {
            System.out.print(day.getRomanian() + "  ");
        }
        System.out.print("\nEnglish:\t");
        for (WeekDays day : WeekDays.values()) {
            System.out.print(day.getEnglish() + "  ");
        }
        System.out.print("\nSpanish:\t");
        for (WeekDays day : WeekDays.values()) {
            System.out.print(day.getSpanish() + "  ");
        }

    }
}