package algorithms;

/**
 * Алгоритм решения задачи "Счастливые билеты"
 */
public class EqualSumsOfDigits {
    private int count = 0;

    public void calculate(int n, int sum1, int sum2) {
        if (n == 0) {
            if (sum1 == sum2) {
                count++;
            }
            return;
        }

        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                calculate(n - 1, sum1 + a, sum2 + b);
            }
        }
    }

    public int getCount() {
        return count;
    }
}
