package testsystem.tasks;

import algorithms.EqualSumsOfDigits;

import java.util.List;

public class EqualSumsOfDigitsTask implements Task {

    @Override
    public Boolean execute(List<String> data, List<String> expected) {

        final EqualSumsOfDigits algo = new EqualSumsOfDigits();
        algo.calculate(Integer.parseInt(data.get(0)), 0, 0);
        return expected.get(0).equals(String.valueOf(algo.getCount()));
    }
}
