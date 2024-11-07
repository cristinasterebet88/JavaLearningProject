package exceptionsservicetask;

public class TextManager {
    public static int getTheTextLength(String input) {
        return input.length();
    }

    public static int getIntLengthWithTryCatchFinally(String input) {
        try {
            return input.length();
        } catch (NullPointerException capturedExceptionInTryBlock) {
            System.out.println("An exception has been captured with the following message: " + capturedExceptionInTryBlock.getMessage());
            return 0;
        } finally {
            System.out.println("The block is executed no matter what");
        }
    }

    public static int getTheTextLengthIFElse(String input) {
        if (input == null) {
            System.out.println("Input string is a null value, be careful");
            return 0;
        } else {
            return input.length();
        }
    }
}