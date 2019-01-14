package day1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

		/* Part two
		For example, using the same list of changes above, the device would loop as follows:

		Current frequency  0, change of +1; resulting frequency  1.
		Current frequency  1, change of -2; resulting frequency -1.
		Current frequency -1, change of +3; resulting frequency  2.
		Current frequency  2, change of +1; resulting frequency  3.
		(At this point, the device continues from the start of the list.)
		Current frequency  3, change of +1; resulting frequency  4.
		Current frequency  4, change of -2; resulting frequency  2, which has already been seen.

		In this example, the first frequency reached twice is 2. Note that your device might need to repeat its list of frequency changes many times before a duplicate frequency is found, and that duplicates might be found while in the middle of processing the list.

		Here are other examples:

		+1, -1 first reaches 0 twice.
		+3, +3, +4, -2, -4 first reaches 10 twice.
		-6, +3, +8, +5, -6 first reaches 5 twice.
		+7, +7, -2, -7, -4 first reaches 14 twice.*/

public class Day1Part2 {
	public static void main(String[] args) throws IOException {
		File file = new File("src" + File.separator + "day1" + File.separator + "input.txt");
		Scanner sc = new Scanner(file);
		int freq = 0;

		ArrayList<Integer> data = new ArrayList();
		LinkedList<Integer> sum = new LinkedList();

		while (sc.hasNextLine()) {
			data.add(Integer.parseInt(sc.nextLine()));
		}
		for (int i = 0; ; i++) {
			if (i == data.size()) {
				i = 0;
			}
			freq += data.get(i);

			for (int j : sum) {
				if (freq == j) {
					System.out.println(freq);
					return;
				}
			}
			sum.add(freq);
		}
	}
}