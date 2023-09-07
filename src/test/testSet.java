package test;

import java.util.HashSet;
import java.util.Set;

public class testSet {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		while(set.size() < 6) 
			set.add((int)(Math.random()*49+1));
		System.out.println(set);
	}
}
