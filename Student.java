/*
 * This class implements a representation of a student
 * Last update - 04/12/23
 */
public class Student implements Comparable<Student> {

	private String firstName, lastName, id;
	int birthYear;

	// constructor
	public Student(String firstName, String lastName, String id, int birthYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.birthYear = birthYear;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	@Override
	public String toString() {
		return "name: " + firstName + " " + lastName + ", id: " + id + ", birth year: " + birthYear;
	}

	// A comparison method unique to this class.
	@Override
	public int compareTo(Student s) {
		return id.compareTo(s.id);
	}
}
