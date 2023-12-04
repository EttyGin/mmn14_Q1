/*
 * This class implements the associative table and checks it
 * Last update - 04/12/23
 */

import java.util.Iterator;
import java.util.Map;

public class Main {
	public static void main(String[] atgs) {
		Student s1 = new Student("Ben", "Levi", "035741235", 2003);
		Student s2 = new Student("Efi", "Ben Ami", "023654128", 1991);
		Student s3 = new Student("Asi", "Gin", "053217585", 2009);

		Student[] keys = { s1, s2, s3 };
		Integer[] vals = { 85, 68, 97 };

		// Creating a 3 member table
		AssociationTable<Student, Integer> assoTable;
		try {
			assoTable = new AssociationTable<>(keys, vals);

			// Adding a new member
			Student s4 = new Student("Lib", "Sher", "03268541", 2001);
			assoTable.add(s4, 83);

			Iterator<Map.Entry<Student, Integer>> iterator1 = assoTable.keyIterator();

			while (iterator1.hasNext()) { // Print the table state
				Map.Entry<Student, Integer> next = iterator1.next();
				System.out.println("student: " + next.getKey() + ", GPA: " + next.getValue());
			}

			System.out.println("\n\tThe current number of students, after adding: " + assoTable.size() + "\n");

			if (assoTable.contains(s1)) {
				assoTable.remove(s1);
				Iterator<Map.Entry<Student, Integer>> iterator2 = assoTable.keyIterator();

				while (iterator2.hasNext()) { // Print the current table state
					Map.Entry<Student, Integer> next = iterator2.next();
					System.out.println("student: " + next.getKey() + ", GPA: " + next.getValue());
				}

				System.out.println("\n\tThe current number of students, after removing: " + assoTable.size());

			}

		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage()); // not the same size
		}
	}
}
