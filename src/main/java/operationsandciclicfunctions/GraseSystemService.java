package operationsandciclicfunctions;

public class GraseSystemService {
    public static void main(String[] args) {
        int testResult = 98;

        if (testResult >= 90) {
            System.out.println("Calificativul A");
        } else if (testResult >= 80) {
            System.out.println("Calificativul B");
        } else if (testResult >= 70) {
            System.out.println("Calificativul C");
        } else if (testResult >= 60) {
            System.out.println("Calificativul D");
        } else {
            System.out.println("Un astfel de calificativ nu este definit");
        }

        System.out.println("Programul s-a terminat");
    }
}
