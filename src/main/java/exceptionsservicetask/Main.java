package exceptionsservicetask;

public class Main {
    public static void main(String[] args) {
        int stringLength = TextManager.getTheTextLength("Sternocleidomastoidian");
        System.out.println(stringLength);

//        System.out.println(TextManager.getTheTextLength(null));
        System.out.println(TextManager.getIntLengthWithTryCatchFinally(null));
        System.out.println("I am happy and I know it");

        System.out.println(ArithmeticOperationService.divideDataWithTryAndCatch(10, 5));
        System.out.println(ArithmeticOperationService.divideDataWithTryAndCatch(10, 0));
        System.out.println("The code is fine, execution is good");
    }
}
