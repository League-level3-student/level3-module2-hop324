package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		boolean isSorted = false;
		int amountOfErrors = 0;
		while(!isSorted) {
			for(int i = 0; i < array.length-1; i++) {
				if(array[i] > array[i+1]) {
					int swapper = array[i];
					array[i] = array[i+1];
					array[i+1] = swapper;
					amountOfErrors++;
				}
				System.out.println(amountOfErrors);
			}
			if(amountOfErrors <= 0) {
				isSorted = true;
				amountOfErrors = 0;
			}
			else {
				amountOfErrors = 0;
			}
		}
	}
	
}
