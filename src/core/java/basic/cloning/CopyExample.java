package io.kapp.core.java.basic.cloning;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Object cloning refers to creation of exact copy of an object.
 * 
 * Deep Copy vs Shallow Copy:
 * 
 * Deep copy: duplicate everything. Cloned object is 100% disjoint. Have to
 * override clone() method. Prefers for copy object has reference to other
 * object(object as fields)
 * 
 * Shallow Copy: duplicate as little as possible. A shallow copy of collection
 * is a copy of collection structure not the elements. Cloned object is NOT 100%
 * disjoint from original objects. Prefer for copy objects with only primitive
 * fields, faster than deep copy.
 * 
 */

public class CopyExample {
	/**
	 * Implement Deep cloning: clone() vs serialization
	 */	
	public void deepCopyWithCloneMethod() {
		System.out.println("=========================Deep Copy: Clone()===========================================");
		List<Contact> originList = new ArrayList<Contact>();
		originList.add(new Contact("Java", "F", new Date()));
		originList.add(new Contact("C#", "M", new Date()));
		originList.add(new Contact("Scala", "F", new Date()));

		List<Contact> cloneList = new ArrayList<Contact>();
		for (Contact p : originList) {
			cloneList.add(p.clone());
		}
		System.out.println("Clonelist size: " + cloneList.size());
	}

	// Preferred and best way to do deep copy: Steps
	/**
	 * -Ensure that all classes in the object are serializable 
	 * - Create output stream for writing the new object and input stream for reading the same.
	 * - Pass the object you want to copy to the output stream. 
	 * - And finally 	 read the object using the input stream
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public void deepCopyWithSerialization() throws IOException, ClassNotFoundException {
		System.out.println("=========================Deep Copy: Serialization()======================================");
		Contact_1 p = new Contact_1("Java", 27);
		// Convert your class a stream of bytes
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream outputStream = new ObjectOutputStream(bos);
		outputStream.writeObject(p);
		outputStream.flush();
		outputStream.close();
		bos.close();
		byte[] byteData = bos.toByteArray();
		
		// Restore class from a stream of bytes;		
		ByteArrayInputStream input = new ByteArrayInputStream(byteData);
		Contact_1 pp = (Contact_1) new ObjectInputStream(input).readObject();
		System.out.println(pp.toString());
	}
	
	/**
	 * Shallow copy: need to implements clonable interface and override clone
	 * method
	 */
	public void shallowCopy() {
		Course science = new Course(407, "Tree hugger", "Tree mediation");
		Student st1 = new Student(101, "Java", science);
		Student st2 = null;

		try {
			st2 = (Student) st1.clone();
			System.out.println(st2.toString());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		CopyExample cp = new CopyExample();
		cp.deepCopyWithCloneMethod();
		cp.deepCopyWithSerialization();
		System.out.println("======================Shallow Copy==================================");
		cp.shallowCopy();
	}
}


