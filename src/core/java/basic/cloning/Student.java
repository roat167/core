package core.java.basic.cloning;

public class Student implements Cloneable {
	int id;
	String name;
	Course course;

	public Student(int id, String name, Course course) {
		this.id = id;
		this.name = name;
		this.course = course;
	}

	// this will create a shallow copy of an object
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return String.format("Stuid: %d, name: %s, Course[id: %d, subject: %s, desc: %s]", this.id, this.name,
				this.course.id, this.course.subject, this.course.description);
	}
}
