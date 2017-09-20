package core.java.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Map (Interface): part of collection (but doesn't implements Collection
 * Interface) of Entry contians key and value, Key in map is unique. Entry is
 * the sub interface of Map
 * 
 * Major implementations: HashSet, LinkedHashSet, TreeSet HashSet: allow only 1
 * null element
 */
public class MapExample {
	
	/**
	 * Hashmap is an implementation of HashTable, lookup time (O(1))
	 * key store based on object's hashcode, 
	 * allow maximum of one null key 
	 * Iteration: no ordered preserved
	 */
	public static void useHashMap() {
		final Map<String, String> map = new HashMap<String, String>();
		map.put("like", "cherry");
		map.put("dislike", "mustard");
		
		System.out.println("cherry".equals(map.get("like")));
		//add
		map.put("like", "strawberry");
		System.out.println("strawberry".equals(map.get("like")));
		
		//what is the output?
		System.out.println(map.containsValue("cherry"));
	}
	
	/**
	 * use binary data structure, store key based on natural ordering
	 * O(log n)
	 * Iteration: the order of the keys is preserved
	 */
	public static void useTreeMap() {
		System.out.println("==============TreeMap========================");
		final Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(5,  "Five");
		map.put(3,  "Three");
		map.put(1,  "One");
		map.put(4,  "Four");
		map.put(2,  "Two");
		
		final Iterator<Integer> keys = map.keySet().iterator();
		while (keys.hasNext()) {
			System.out.println(keys.next());
		}
	}
	
	/**
	 * implementation the same as HashMap but 
	 * The order of the keys are the same as insertions
	 */
	public static void useLinkedHashMap() {
		System.out.println("==============Key as Integer=================");
		final Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(5,  "Five");
		map.put(3,  "Three");
		map.put(1,  "One");
		map.put(4,  "Four");
		map.put(2,  "Two");
		
		final Iterator<Integer> keys = map.keySet().iterator();
		while (keys.hasNext()) {
			System.out.println(keys.next());
		}
		System.out.println("==============Key as String==================");
		final Map<String, Integer> mapString = new LinkedHashMap<String, Integer>();
		mapString.put("Coca",  30);
		mapString.put("Pepsi",  15);
		mapString.put("Angkor",  25);
		
		final Iterator<String> stKey = mapString.keySet().iterator();
		while (stKey.hasNext()) {
			System.out.println(stKey.next());
		}		
	}
	
	/**
	 * thread-safe: mainly used for sharing map instance with many Thread able to
	 * return read values while the values are being written to the map. Only
	 * the specified row of the table is locked during a write, leaving the rest
	 * of the map available for reading. 
	 */
	public static void useConcurrentHashMap() {
		
	}
	
	public static void main(String[] args) {
		MapExample.useTreeMap();
		MapExample.useLinkedHashMap();
	}

}
