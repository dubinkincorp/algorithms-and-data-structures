package algorithms.raisingnumbertopower;

public class Iterative {

    private final long num;
    private final long power;

    public Iterative(long num, long power) {
        this.num = num;
        this.power = power;
    }

    public long calculate() {
        long p = 1;

        for (int i = 0; i < power; i++) {
            p *= num;
        }

        return p;
    }
}
