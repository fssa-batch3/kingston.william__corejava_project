package day09.testcase;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import day09.practice.NumberSorting;

public class TestNumberSorting {
	
	@Test
	public void TestMethod(){
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(5);
		arr.add(3);
		
		Assertions.assertTrue(NumberSorting.sort(arr));
	}
	
	
	@Test
	public void TestArrayNull(){
		try {
			NumberSorting.sort(null);
		} catch (Exception e) {
			Assertions.assertEquals("Array cannot be null", e.getMessage());
		}
	}
}