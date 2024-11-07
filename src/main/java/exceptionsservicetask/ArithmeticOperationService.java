package exceptionsservicetask;

public class ArithmeticOperationService {
    public static double divideData(double a, double b) {
        return a / b;
    }

    public static int divideDataWithTryAndCatch(int a, int b) {
        try {
            return a / b;
        } catch (RuntimeException exception) {
            System.out.println(exception.getMessage());
            exception.printStackTrace();//Se printeaza la urma Stack♦Trace
            return 0;
        }
    }
}
