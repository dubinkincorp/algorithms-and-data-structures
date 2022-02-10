package testsystem.tasks;

import java.util.List;

public interface Task {

    /**
     * @param data - read data from file in lines
     * @return
     */
    Boolean execute(List<String> data, List<String> expected);
}