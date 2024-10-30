package operationsandciclicfunctions;

public class LogicalOperationsExample {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        boolean andResult = a && b;
        System.out.println("Și logic: " + andResult);

        boolean orResult = a || b;
        System.out.println("Sau logic: " + orResult);

        boolean notResult = !a;
        System.out.println("Negarea unei expresii: " + notResult);
    }
}
