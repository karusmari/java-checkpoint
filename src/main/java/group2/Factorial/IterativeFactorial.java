package group2.Factorial;

public class IterativeFactorial extends Factorial {
    @Override
    public long calculate(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = n; i >= 1; i--) {
            result *= i;
        }
        return result;
    }
}