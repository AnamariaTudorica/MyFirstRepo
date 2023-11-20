package ro.scoalainformala;

/* model the months of the year, storing their names in Romanian,
 ordinal number and popular names in:
 Romania (Ianuarie = Gerar, Februarie = Faurar etc.)
 */
public class Main {
    public static void main(String[] args) {

        System.out.print("Romana:\t");
        for (MonthsOfYear day : MonthsOfYear.values()) {
            System.out.print(day.getRomana() + "  ");
        }
        System.out.print("\nRomana populara:\t");
        for (MonthsOfYear day : MonthsOfYear.values()) {
            System.out.print(day.getRomana_populara() + "  ");
        }
    }
}