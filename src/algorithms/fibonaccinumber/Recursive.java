package algorithms.fibonaccinumber;

public class Recursive {

    public long calculate(long n) {
        if (n <= 1) {
            return n;
        }

        return calculate(n - 1) + calculate(n - 2);
    }
}
