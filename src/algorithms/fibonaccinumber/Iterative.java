package algorithms.fibonaccinumber;

public class Iterative {

    public void calculate(long n) {
        long f0 = 0;
        long f1 = 1;
        long f2;

        System.out.println(f0);
        System.out.println(f1);

        for (int i = 0; i < n; i++) {
            f2 = f0 + f1;
            f0 = f1;
            f1 = f2;

            System.out.println(f2);
        }
    }

    public static void main(String[] args) {
        final Iterative iterative = new Iterative();
        iterative.calculate(21);
    }
}
