package Lec_11.BasicException.FinallyBlock;

public class FinallyExample {

    public static void test() {
        try {
        } catch (ArithmeticException e) {
            System.out.println("Caught exception");
        } finally {
            System.out.println("Finally block always runs");
        }
    }
}