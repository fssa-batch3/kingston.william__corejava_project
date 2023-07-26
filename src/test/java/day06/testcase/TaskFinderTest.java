package day06.testcase;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import day06.practice.Task;
import day06.practice.TaskFinder;

public class TaskFinderTest {

    @Test
    public void testFindTaskExists() {
        List<Task> arr = new ArrayList<>();

        // Creating tasks
        Task task1 = new Task("practice java", 10);
        Task task2 = new Task("practice DSA", 8);
        Task task3 = new Task("practice English", 7);

        // Push the task objects into the array
        arr.add(task1);
        arr.add(task2);
        arr.add(task3);

        assertTrue(TaskFinder.find(arr, "practice java"));
    }
}
