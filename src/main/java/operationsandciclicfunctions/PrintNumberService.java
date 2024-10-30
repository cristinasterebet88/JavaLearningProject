package operationsandciclicfunctions;

public class PrintNumberService {
    public static void main(String[] args) {
        int a = 500;
        int limit = 500;

        while (a > 0) {
            System.out.print(a + ". ");
            a--;
        }
        //valoparea lui a devine zero la iesire
        System.out.println();

        do {
            System.out.print(a + ". ");
            a = a + 1;
            a++;
        } while (a < limit);
        System.out.println();

        for (int i = 1; i <= limit; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();

        for (int i = 1; i <= limit; i++) {
            if ((i % 2) == 0) {
                System.out.print(i + ", ");
            } else {
                System.out.print("[]. ");
            }
        }
    }
}
