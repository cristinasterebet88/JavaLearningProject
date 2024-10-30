package operationsandciclicfunctions;

public class AssignmentOperationsExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int result = a;
        System.out.println("Atribuire simpla:" + result);

        result += b;
        System.out.println("Atribuire cu adunare" + result);

        result -= b;
        System.out.println("Atribuire cu scadere" + result);

        result *= b;
        System.out.println("Atribuire cu inmultire" + result);

        result /= b;
        System.out.println("Atribuire cu impartire" + result);

        result %= b;
        System.out.println("Atribuire cu restul impartirii" + result);
    }
}
