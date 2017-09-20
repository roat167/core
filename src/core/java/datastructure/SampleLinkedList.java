package core.java.datastructure;

/**
 * LinkedList: The instance contains reference to the head element The inner
 * class Element is a recursive data type, which has' next' element pointing
 * pointing to next element in the list.
 * 
 * Type: 
 * - Singly LinkedList 
 * - Double LinkedList: has two references, next node(element) and previous node.
 * 
 * Operations: 
 * - addFirst
 * - addLast
 * - Traversing
 * - insertAfter
 * - insertBefore
 * - delete
 * - iterator: next, hasNext, remove
 * 
 * Benefit of using linked list: 
 * - memory consumption (shrink/grow on demand) 
 * - insertion and deletion take O(1) faster
 * than ArrayList
 */

public class SampleLinkedList<E> {
	private Element<E> head;

	private static class Element<E> {
		E value;
		Element<E> next;
	}

	public static void main(String[] args) {

	}
}
