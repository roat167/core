package core.java.datastructure;

import java.util.ArrayList;
import java.util.List;

/**
 * Arrays are object in Java. It a collection of similar type elements
 * It is index based. And fixed size
 *  you may write 'int[] arr' or 'int arr[]'
 *
 */
public class ArrayExample {
	
	public static void arrayAsObject() {
		List<Object> list = new ArrayList<Object>();
		list.add(new int[]{1, 3, 4, 6, 7});
		
		//expected true
		System.out.println(list.get(0) instanceof int[]); 		
	}
	
	public static void arrayAsReference() {
		final int[] arr = new int[]{1, 3, 4, 6, 7};
		int[] refArr = arr;
		
		refArr[3] = 2;
		//expected : 2
		System.out.println(arr[3]);
	}
	
	public static void intArray() {
		// declare array
		int[] arr = new int[]{1, 3, 4, 6, 7};
		
		//option 2
		arr = new int[3];
		arr[0] = 1;
		arr[1] = 4;
		arr[2] = 6;
		
		//option 3
		int[] arr2 = {1, 3, 4, 6, 7};
		System.out.print(arr2.length);
		
		//System.arraycopy(src, srcPos, dest, destPos, length);
	}
	
	//2D Array
	public static void twoDimensionArray() {
		int[][] arr = new int[][] {{1,2,4,6}, { 20,4,5,8}};
		System.out.println("==============Access 2D Size ==============");
		System.out.println("============Row============: " + arr.length); 
		System.out.println("============Column=========: " + arr[0].length);
		for (int i = 0; i < arr.length; i ++) {			
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("arr[%d][%d] :: %d \n", i, j, arr[i][j]);	
			}			
		}		
	}
	
	public static void main(String[] args) {
		ArrayExample.arrayAsObject();
		ArrayExample.arrayAsReference();
		ArrayExample.twoDimensionArray();
	}

}
