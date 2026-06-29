package exception_handling;

public class finallyyy {
    public static void main(String[] args) {
        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught");
        } finally {
            System.out.println("Finally block");
        }
    }
}
