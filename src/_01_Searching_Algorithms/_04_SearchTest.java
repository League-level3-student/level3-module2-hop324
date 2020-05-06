package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] funyArray = {"yeet", "yote", "yagga","Shrek"};
		new _00_LinearSearch();
		assertEquals(2, _00_LinearSearch.linearSearch(funyArray, "yagga"));
		assertEquals(3, _00_LinearSearch.linearSearch(funyArray, "Shrek"));
		assertEquals(-1, _00_LinearSearch.linearSearch(funyArray, "All Star"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] funnyArray = {0, 3, 6, 7, 8, 9, 10, 14, 20, 100, 540, 768, 988, 3128, 3517};
		new _01_BinarySearch();
		assertEquals(11, _01_BinarySearch.binarySearch(funnyArray, 0, 14, 768));
		assertEquals(2, _01_BinarySearch.binarySearch(funnyArray, 0, 14, 6));
		assertEquals(-1, _01_BinarySearch.binarySearch(funnyArray, 0, 14,11));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] funnyArray = {0, 3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
		new _02_InterpolationSearch();
		assertEquals(4, _02_InterpolationSearch.interpolationSearch(funnyArray, 12));
		assertEquals(9, _02_InterpolationSearch.interpolationSearch(funnyArray, 27));
		assertEquals(-1, _02_InterpolationSearch.interpolationSearch(funnyArray, 22));
	}

	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] funnyArray = {0, 3, 6, 7, 8, 9, 10, 14, 20, 100, 540, 768, 988, 3128, 3517};
		new _03_ExponentialSearch();
		assertEquals(7, _03_ExponentialSearch.exponentialSearch(funnyArray, 14));
		assertEquals(-1, _03_ExponentialSearch.exponentialSearch(funnyArray, 22));
		assertEquals(9, _03_ExponentialSearch.exponentialSearch(funnyArray, 100));
	}
}
