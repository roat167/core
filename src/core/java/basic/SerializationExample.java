package core.java.basic;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Serialization: Object => Stream, Deserialization: Stream => Object
 * 
 * Mechanism of writing state of an object into a byte stream, mainly used for
 * marshaling (travel object's state on the network). String class and all the
 * wrapper classes implements java.io.Serializable interface by default
 */
public class SerializationExample {
	private static final String fileName = "person.txt";

	public static void serialable() throws IOException {
		Person p = new Person("Java", "Monoco", "high-class");

		FileOutputStream fileOutputStream = new FileOutputStream(SerializationExample.fileName);
		ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);

		/*
		 * writeObject(): serialize the object object in the file named f.txt.
		 */
		out.writeObject(p);
		// saving the state of the object p to file
		out.flush();

		System.out.println("Success");

		out.close();
	}

	public static Person deserialable() throws IOException, ClassNotFoundException {
		Person p = null;
		FileInputStream fileStream = new FileInputStream(SerializationExample.fileName);
		try {
			ObjectInputStream objectStream = new ObjectInputStream(fileStream);
			p = (Person) objectStream.readObject();
			objectStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fileStream.close();
		}
		return p;
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("=============serialization====================");
		SerializationExample.serialable();
		System.out.println("=============Deserialization==================");
		Person p = SerializationExample.deserialable();		
		System.out.println(p);		
	}

}

class Person implements Serializable {
	private String name;
	private String address;

	// transient: ignore field from serializable
	private transient String comment;

	public Person(String name, String address, String comment) {
		this.name = name;
		this.address = address;
		this.comment = comment;
	}

	@Override
	public String toString() {
		return String.format("Name: %s, Address: %s, Comment: %s ", this.name, this.address, this.comment);
	}
}

class Person2 implements Externalizable {
	private int id;
	private String name;
	private String address;

	public Person2(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(this.id);
		out.writeObject(this.name);
		out.writeObject(this.address);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		this.id = in.readInt();
		this.name = (String) in.readObject();
		this.address = (String) in.readObject();
	}

	@Override
	public String toString() {
		return String.format("ID: %d, Name: %s, Address: %s ", this.id, this.name, this.address);
	}
}
