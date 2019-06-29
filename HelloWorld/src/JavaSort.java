import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.hackerrank.java.pojo.Student;

public class JavaSort {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = new ArrayList<Student>();
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}

		Collections.sort(studentList, Comparator.comparingDouble(Student::getCgpa).reversed()
				.thenComparing(Student::getFirstName).thenComparing(Student::getStd_id));
		for (Student st : studentList) {
			System.out.println(st.getFirstName());
		}
	}

}
