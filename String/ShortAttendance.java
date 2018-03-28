package String;

import java.util.*;

public class ShortAttendance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			ArrayList<String> names = new ArrayList();

			int numberOfStudents = sc.nextInt();

			String[] nameOfStudents = new String[numberOfStudents];
			String[] attendance = new String[numberOfStudents];

			int attendanceperc = 0;

			for (int j = 0; j < numberOfStudents; j++) {
				nameOfStudents[j] = sc.next();
			}

			for (int k = 0; k < numberOfStudents; k++) {
				int count = 0;
				attendance[k] = sc.next();
				char[] attendanceArr = attendance[k].toCharArray();

				int total = attendance[k].length();

				for (int j = 0; j < attendanceArr.length; j++) {
					if (attendanceArr[j] == 'P') {
						count++;
					}
					if (attendanceArr[j] == 'A' || attendanceArr[j] == 'M') {
						total--;
					}
				}
				attendanceperc = (count * 100) / total;
				if (attendanceperc < 75) {
					names.add(nameOfStudents[k]);
				}
			}

			String result = String.valueOf(names);
			System.out.println(result);

		}
	}

}
