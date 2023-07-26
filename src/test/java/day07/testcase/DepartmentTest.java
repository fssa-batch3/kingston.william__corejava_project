package day07.testcase;

//import static org.junit.Assert.*;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import day08.practice.Department;

public class DepartmentTest {

    @Test
    public void testCategorizeDepartment() {
        String[] arr = {"HR,Ram", "HR,Suresh", "IT,Basker", "IT,Joseph", "Admin,Sundar"};

        assertTrue(Department.categorizeDepartment(arr));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullInput() {
        String[] arr = null;

        Department.categorizeDepartment(arr);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyInput() {
        String[] arr = {};

        Department.categorizeDepartment(arr);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidInput() {
        String[] arr = {"HR,Ram", "HR,Suresh", "IT,Basker", "IT,Joseph", "Admin"};

        Department.categorizeDepartment(arr);
    }
}
