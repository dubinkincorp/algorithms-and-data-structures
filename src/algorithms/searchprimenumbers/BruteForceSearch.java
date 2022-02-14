package algorithms.searchprimenumbers;

public class BruteForceSearch {

    public long calculate(long n) {
        long cnt = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                cnt++;
            }
        }

        return cnt;
    }

    private boolean isPrime(long num) {
        long cnt = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                cnt++;
            }
        }

        return cnt == 2;
    }
}
