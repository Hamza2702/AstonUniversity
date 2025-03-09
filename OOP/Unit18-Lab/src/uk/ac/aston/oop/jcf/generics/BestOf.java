package uk.ac.aston.oop.jcf.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Container which only holds the best N items out of all
 * the items that have been added so far. We will develop
 * this class in several rounds:
 * 
 * 1. First, with just Comparable (no generics and warnings).
 * 2. Then, we will add a type parameter.
 * 3. Finally, we will use type bounds to ensure it's
 *    completely safe to use.
 */
public class BestOf <T extends Comparable<? super T>> {
	
	private List<T> items;
	private int maxItems;
	
	public BestOf(int maxItems) {
		this.maxItems = maxItems;
		this.items = new ArrayList<>();
	}
	
	public List<T> getItems(){
		return Collections.unmodifiableList(items);
	}
	
	public void add(T c) {
		items.add(c);
		Collections.sort(items);
		if (items.size() > maxItems) {
			items.remove(0);
		}
	}
	
	public static void main(String[] args) {
		/*
		 * Sample code using the first complete version of this class.
		 * Uncomment when it is ready.
		 */

		
		final BestOf<Integer> bestScores = new BestOf<Integer>(3);
		bestScores.add(3000);
		bestScores.add(4200);
		bestScores.add(2600);
		bestScores.add(1500);

		for (Integer c : bestScores.getItems()) {
			System.out.println(c);
		}
		
	}
}
