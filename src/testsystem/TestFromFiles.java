package testsystem;

import testsystem.tasks.Task;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TestFromFiles {

    public List<TestResult> executeTests(String path, Task task, int testsCount) throws IOException {
        final List<TestResult> results = new ArrayList<>();

        for (int i = 0; i < testsCount; i++) {
            final String pathIn = path + File.separator + "test." + i + ".in";
            final String pathOut = path + File.separator + "test." + i + ".out";

            results.add(executeTest(pathIn, pathOut, task));
        }

        return results;
    }

    public TestResult executeTest(String pathIn, String pathOut, Task task) throws IOException {

        final long start = System.currentTimeMillis();
        final Boolean result = task.execute(
                Files.readAllLines(Paths.get(pathIn)),
                Files.readAllLines(Paths.get(pathOut))
        );
        final long finish = System.currentTimeMillis();

        return new TestResult(String.valueOf(result), finish - start);
    }
}
