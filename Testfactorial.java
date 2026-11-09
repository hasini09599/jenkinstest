public class Testfactorial {
    public static void main(String[] args) {
        int n = 5;
        int result = Factorial(n);
        try {
            if (Factorial(5) != 120) {
                throw new AssertionError("output does not match");
            }
            if (n < 0) {
                throw new AssertionError("0 not possible");
            }
        } catch (Exception e) {
            System.out.println("ExceptionError: " + e.getMessage());
        }
        System.out.println("Factorial: " + result);

    }
}
