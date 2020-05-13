package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for(int j = 0; j < eggs.size(); j++) {
			System.out.println(eggs.get(j));
			if(eggs.get(j).contains("cracked")){
				return j;
			}
		}
		return -1;
	}
	
	public static int countPearls(List<Boolean> ree) {
		int counter = 0;
		for(int i = 0; i < ree.size(); i++) {
			if(ree.get(i)) {
				counter++;
			}
		}
		return counter;
	}
	
	public static double findTallest(List<Double> ree) {
		Double max = 0.0;
		for(int i = 0; i < ree.size(); i++) {
			if(ree.get(i) > max) {
				max = ree.get(i);
			}
		}
		return max;
	}
	
	public static String findLongestWord(List<String> ree) {
		String max = "";
		for(int i =0; i< ree.size(); i++) {
			if(ree.get(i).length() > max.length()) {
			max = ree.get(i);	
			}
		}
		return max;
	}
	
	public static boolean containsSOS(List<String> ree) {
		
		return true;
	}
	
}
