package day1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

		/* Part one
		For example, if the device displays frequency changes of +1, -2, +3, +1, then starting from a frequency of zero, the following changes would occur:

		Current frequency  0, change of +1; resulting frequency  1.
		Current frequency  1, change of -2; resulting frequency -1.
		Current frequency -1, change of +3; resulting frequency  2.
		Current frequency  2, change of +1; resulting frequency  3.

		In this example, the resulting frequency is 3.

		Here are other example situations:

		+1, +1, +1 results in  3
		+1, +1, -2 results in  0
		-1, -2, -3 results in -6

		Starting with a frequency of zero, what is the resulting frequency after all of the changes in frequency have been applied?*/

public class Day1Part1 {
	public static void main(String[] args) throws IOException {
		File file = new File("src" + File.separator + "day1" + File.separator + "input.txt");
		Scanner sc = new Scanner(file);
		int freq = 0;

		while (sc.hasNextLine()) {
			freq += Integer.parseInt(sc.nextLine());
		}
		System.out.println(freq);
	}
}