
public class Fibonacci {

    static boolean isFibonacci(int num) {
        int a = 0, b = 1;
        if (num == a || num == b) {
            return true;
        }

        int fib = a + b;
        while (fib <= num) {
            if (fib == num) {
                return true;
            }
            a = b;
            b = fib;
            fib = a + b;
        }

        return false;
    }
}

