package day039;

/**
 * 509. Fibonacci Number
 *
 * @author created by sunjy on 2/8/24
 */
public class FibonacciNumber {

    public static int fib(int n) {
        int f0 = 0;
        int f1 = 1;
        if (n == 0) {
            return f0;
        }
        if (n == 1) {
            return f1;
        }
        int fn = 0;
        int count = 2;
        while (count <= n) {
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
            count++;
        }
        return fn;
    }

    public static void main(String[] args) {
        System.out.println(fib(6));
    }

}
