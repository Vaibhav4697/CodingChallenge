package info.inheritance;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();

		int[] testScores = new int[numScores];
		for (int i = 0; i < numScores; i++) {
			testScores[i] = scan.nextInt();
		}

		scan.close();

		Student student = new Student(firstName, lastName, id, testScores);
		student.printPerson();
		System.out.println("Grade: " + student.calculate());
	}

}