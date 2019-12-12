package hammy;

public class Fibonnacci {
    public static void main(String[] args) {
        fibonacciRecursive(10);
    }
    public static int fibonacciRecursive(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}
