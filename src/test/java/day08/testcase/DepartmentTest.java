package day08.testcase;

//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

public class DepartmentTest {

    @Test
    public void testHashMapModifications() {
        // Arrange: Create the initial HashMap with department names and employee counts
        HashMap<String, Integer> deptMap = new HashMap<>();
        deptMap.put("HR", 5);
        deptMap.put("ADMIN", 10);
        deptMap.put("DEVELOPERS", 300);

        // Act: Modify the count for the "HR" department
        int hrCount = deptMap.get("HR");
        hrCount += 1;
        deptMap.put("HR", hrCount);

        // Assert: Verify the modifications
        assertEquals(6, (int) deptMap.get("HR")); // The count for "HR" should be 6 after modification
        assertEquals(10, (int) deptMap.get("ADMIN")); // The count for "ADMIN" should remain unchanged (10)
        assertEquals(300, (int) deptMap.get("DEVELOPERS")); // The count for "DEVELOPERS" should remain unchanged (300)
    }
}
