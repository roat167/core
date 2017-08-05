package io.kapp.core.java.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Set (Interface): Type of collection that has no duplication elements, it is
 * not sorted in order
 * 
 * Major implementations: HashSet, LinkedHashSet, TreeSet
 * HashSet: allow only 1 null element
 */
public class SetExample {

	// No duplication and unordered, internally use HashMap
	public static void useHashSet_integer() {
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(4);
		set.add(3);		
		set.add(10);
		set.add(4);
		set.add(11);
		set.add(5);
		SetExample.printSet(set);
	}

	public static void useHashSet_double() {
		Set<Double> set = new HashSet<Double>();
		set.add(1.0);
		set.add(4.0);
		set.add(3.0);		
		set.add(10.0);
		set.add(4.0);
		set.add(11.0);
		set.add(5.0);
		set.forEach(System.out::println);
	}

	// HashSet->NavigableSet->SortedSet
	public static void useTreeSet() {
		Set<Integer> treeset = new TreeSet<Integer>();
		treeset.add(1);
		treeset.add(4);
		treeset.add(3);		
		treeset.add(10);
		treeset.add(4);
		treeset.add(11);
		treeset.add(5);
		SetExample.printSet(treeset);
	}

	// HashSet->NavigableSet->SortedSet
	public static void useTreeSetWithSortedSet() {
		SortedSet<Integer> sortedSet = new TreeSet<Integer>();
		sortedSet.add(1);
		sortedSet.add(4);
		sortedSet.add(3);		
		sortedSet.add(10);
		sortedSet.add(4);
		sortedSet.add(11);
		sortedSet.add(5);
		SetExample.printSet(sortedSet);
	}

	/*
	 * unique elements only like HashSet. Provides all optional set operations,
	 * and permits null elements. Maintains insertion order.
	 */
	public static void useLinkedHashSet() {
		Set<Integer> treeHashSet = new LinkedHashSet<Integer>();
		treeHashSet.add(1);		
		treeHashSet.add(4);
		treeHashSet.add(3);
		treeHashSet.add(10);
		treeHashSet.add(4);
		treeHashSet.add(11);
		treeHashSet.add(5);
		SetExample.printSet(treeHashSet);
	}

	private static void printSet(Set<Integer> set) {
		set.forEach(System.out::println);
	}

	// The intersection of two sets is the set containing only the elements
	// common to both sets.)
	public static void intersetionSets() {
		Set<Integer> s1 = new HashSet<Integer>(Arrays.asList(1 , 2, 4, 5));		
		
		Set<Integer> s2 = new HashSet<Integer>();
		s2.addAll(Arrays.asList(4, 11, 6, 7, 10, 5));
		
		s1.forEach(System.out::println);
		
		s1.retainAll(s2);
		System.out.println("============After retaining (intersetion)=========");
		s1.forEach(System.out::println);
		
	}

	public static void main(String[] args) {
		/**
		 * You may be surprised to see the HashSet for int[] is sort: For int
		 * and double, these are auto-boxed into the Integer and Double classes.
		 * When you make a HashSet of int[], it uses Integer's hashCode()
		 * method, which just returns the int. So if you add int[], they get
		 * stored sorted. Double's hashcode is much more complicated, that's why
		 * it is not sorted
		 */
		System.out.println("================Hashset with Integer=======");
		SetExample.useHashSet_integer();

		System.out.println("================Hashset with Double=======");
		SetExample.useHashSet_double();

		System.out.println("================LinkedHashSet Set==================");
		SetExample.useLinkedHashSet();

		System.out.println("================TreeSet Set========================");
		SetExample.useTreeSet();

		System.out.println("================TreeSet1 Set=======================");
		SetExample.useTreeSetWithSortedSet();
		
		System.out.println("================Intersetion example================");
		SetExample.intersetionSets();
	}
}
