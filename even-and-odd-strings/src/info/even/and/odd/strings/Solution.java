package info.even.and.odd.strings;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int testCases = in.nextInt();

		int n[] = new int[testCases];
		int m[] = new int[testCases];
		int solution[] = new int[testCases];
		int modulo = 1000000007;

		for (int i = 0; i < testCases; ++i) {
			n[i] = in.nextInt();
			m[i] = in.nextInt();

			int evenStrings = 0;
			int oddStrings = 0;

			for (int e = 0; e < n[i]; ++e) {
				evenStrings = (evenStrings * 2) + 1;
			}

			for (int o = 0; o < m[i] - 1; ++o) {
				oddStrings = (oddStrings * 2) + 1;
			}

			solution[i] = (evenStrings + oddStrings + (evenStrings * oddStrings)) % modulo;
		}

		for (int i = 0; i < testCases; ++i) {
			System.out.println(solution[i]);
		}

		in.close();

	}

}
