package operationsandciclicfunctions;

public class ComparisonOperationsExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Egal cu
        boolean isEqual = a == b;
        System.out.println("Egal cu: " + isEqual);

        boolean isNotEqual = a != b;
        System.out.println("Diferit de: " + isNotEqual);

        boolean isGreaterThan = a > b;
        System.out.println("Mai mare decât: " + isGreaterThan);

        boolean isLessThan = a < b;
        System.out.println("Mai mic decât: " + isLessThan);

        boolean isGreaterThanOrEqual = a >= b;
        System.out.println("Mai mare sau egal cu: " + isGreaterThanOrEqual);

        boolean isLessThanOrEqual = a <= b;
        System.out.println("Mai mic sau egal cu: " + isLessThanOrEqual);
    }
}
