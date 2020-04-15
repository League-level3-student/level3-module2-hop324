package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	//1. Write a static method called intArraySorted. 
	//   This method takes in an array of integers
	//   and it returns a boolean.
	//   The method returns true if the integer
	//   array is in ascending order and false otherwise

	static boolean intArraySorted(int[] pop) {
		int min = 0;
		for(int i = 0; i < pop.length; i++) {
			if(pop[i] < min) {
				return false;
			}
			else {
				min = pop[i];
			}
		}
		return true;
	}
	//2. Write a static method called doubleArraySorted. 
	//   This method takes in an array of doubles
	//   and it returns a boolean.
	//   The method returns true if the double
	//   array is in ascending order and false otherwise

	static boolean doubleArraySorted(double[] goes) {
		double min = 0;
		for(int i = 0; i < goes.length; i++) {
			if(goes[i] < min) {
				return false;
			}
			else {
				min = goes[i];
			}
		}
		return true;
	}
	//3. Write a static method called charArraySorted. 
	//   This method takes in an array of characters
	//   and it returns a boolean.
	//   The method returns true if the character
	//   array is in alphabetical order and false otherwise
	//   (You can compare characters just like integers)
	static boolean charArraySorted(char[] the) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		for(int i = 0; i < the.length; i++) {
			if(the[i] != alphabet.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	
	//4. Write a static method called stringArraySorted. 
	//   This method takes in an array of Strings
	//   and it returns a boolean.
	//   The method returns true if the String
	//   array is in alphabetical order and false otherwise
	//   (Use the compareTo(String) method)
	static boolean stringArraySorted(String[] weasel) {
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char min = weasel[0].charAt(0);
		int minTracker = 0;
		int currentValue = 0;
		for(int i = 0; i < alphabet.length; i++) {
			if(min == alphabet[i]) {
				minTracker = i;
			}
		}
		for(int i = 1; i < weasel.length; i++) {
			for(int j = 0; j < alphabet.length; j++) {
				if(weasel[i].charAt(0) == alphabet[j]) {
					currentValue = j;
					System.out.println(currentValue);
				}
				if(currentValue < minTracker) {
					return false;
				}
			}
		}
		return true;
	}
}
