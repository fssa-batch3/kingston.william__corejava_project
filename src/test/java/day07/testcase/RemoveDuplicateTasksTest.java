package day07.testcase;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import day07.practice.RemoveDuplicateTasks;
import day07.practice.Task;

public class RemoveDuplicateTasksTest {

    @Test
    public void testRemoveDuplicateTasks() {
        List<Task> arr = new ArrayList<>();

        LocalDate date = LocalDate.of(2020, 1, 8);
        LocalDate date2 = LocalDate.of(2023, 5, 10);

        // Creating tasks
        Task task1 = new Task(1, "wake-up", date);
        Task task2 = new Task(2, "wake-up", date);
        Task task3 = new Task(3, "write", date2);

        // Push the task objects into the array
        arr.add(task1);
        arr.add(task2);
        arr.add(task3);

        // Redirecting System.out to a ByteArrayOutputStream
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        // Run the RemoveDuplicateTasks code
        RemoveDuplicateTasks.main(null);

        // Capturing the output
        String capturedOutput = outputStream.toString();

        // Expected output
        String expectedOutput = "Task [id=3, taskName=write, date=2023-05-10]\n" +
                                "Task [id=1, taskName=wake-up, date=2020-01-08]\n";

        // Asserting that the output matches the expected output
        assertEquals(expectedOutput, capturedOutput);
    }
}

