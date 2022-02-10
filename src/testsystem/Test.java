package testsystem;

import testsystem.tasks.EqualSumsOfDigitsTask;
import testsystem.tasks.Task;

import java.io.IOException;
import java.util.List;

public class Test {

    public static void main(String[] args) throws IOException {
        final TestFromFiles testFromFiles = new TestFromFiles();
        final Task task = new EqualSumsOfDigitsTask();
        final String path = "/etc/A01_Счастливые_билеты-1801-057a77/1.Tickets";
        final List<TestResult> testResults = testFromFiles.executeTests(
                path,
                task,
                5
        );

        testResults.forEach(tr -> System.out.println(tr.result + " " + "duration:" + tr.duration));
    }
}
