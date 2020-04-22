package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}
	
	// Bogo sort is a joke sorting algorithm. It is considered the most 
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.
	
	// It works by following these steps:
	// STEP 1. Is the array in order?
	//	if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.
	
	//1. Complete the sort method using the Bogo sort algorithm. 
	@Override
	void sort(int[] array, SortingVisualizer display) {
// This is so dumb why would you ever use this. Like literally Bruh. With a name like Bogo I kinda expected this
	Random randy = new Random();
	boolean isSorted = false;
	int holder = array[0];
	int tracker = 0;
	while(!isSorted) {
		for(int i = 1; i < array.length; i++) {
			if(holder > array[i]) {
				tracker++;
			}
		}
		if(tracker > 0) {
			tracker = 0;
			isSorted = true;
		}
		else {
			tracker = 0;
			int billy = randy.nextInt(array.length);
			int silly = randy.nextInt(array.length);
			int chilly = array[billy];
			array[billy] = array[silly];
			array[silly] = chilly;
		}
	}
	}
}
