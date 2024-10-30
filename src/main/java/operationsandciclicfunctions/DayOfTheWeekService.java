package operationsandciclicfunctions;

public class DayOfTheWeekService {
    public static void main(String[] args) {
        int dayNumber;
        String dayName = "Joi";

        System.out.println(dayName.toUpperCase());

        switch (dayName.toUpperCase()) {
            case "LUNI":
                dayNumber = 1;
                break;
            case "MARTI":
                dayNumber = 2;
                break;
            case "MIERCURI":
                dayNumber = 3;
                break;
            case "JOI":
                dayNumber = 4;
                break;
            case "VINERI":
                dayNumber = 5;
                break;
            case "SAMBATA":
                dayNumber = 6;
                break;
            case "DUMINICA":
                dayNumber = 7;
                break;
            default:
                dayNumber = 0;
                System.out.println("Ai introdus o zi care nu e definita");
        }

        System.out.println("Numarul zilei " + dayName + " este " + dayNumber);
    }
}
