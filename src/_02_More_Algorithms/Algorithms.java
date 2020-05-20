package _02_More_Algorithms;

import java.util.Arrays;
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
		System.out.println(ree);
		if(ree.contains("... --- ...")){
			return true;
		}
		else {
			return false;
		}
	}
	
	public static List<Double> sortScores(List<Double> tynamoPlz) {
		double min = 10000;
		for(int i = 0; i < tynamoPlz.size()-1; i++) {
			if(tynamoPlz.get(i) < min) {
				min = tynamoPlz.get(i);
			}
		}
		while(tynamoPlz.get(0) != min)
		for(int i = 0; i < tynamoPlz.size()-1; i++) {
			if(tynamoPlz.get(i) > tynamoPlz.get(i+1)) {
				Double holder = tynamoPlz.get(i);
				tynamoPlz.set(i, tynamoPlz.get(i+1));
				tynamoPlz.set(i+1, holder);
			}
		}
		return tynamoPlz;
	}
	
	public static List<String> sortDNA(List<String> DQ){
		for(int g = 0; g < 100; g++) {
			for(int i = 0; i < DQ.size()-1; i++) {
				if(DQ.get(i).length() > DQ.get(i+1).length()) {
					String holder = DQ.get(i);
					DQ.set(i, DQ.get(i+1));
					DQ.set(i+1, holder);
				}
			}
		}
	return DQ;
	}
	
	public static List<String> sortWords(List<String> Tim) {
		for(int g = 0; g < 100; g++) {
			for(int i = 0; i < Tim.size()-1; i++) {
			if(0 < Tim.get(i).compareTo(Tim.get(i+1))){
				String holder = Tim.get(i);
				Tim.set(i, Tim.get(i+1));
				Tim.set(i+1, holder);
			}
			}
		}
		return Tim;
	}
	
}
