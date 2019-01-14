package day2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

		/* Part One
		For example, if you see the following box IDs:

		abcdef contains no letters that appear exactly two or three times.
		bababc contains two a and three b, so it counts for both.
		abbcde contains two b, but no letter appears exactly three times.
		abcccd contains three c, but no letter appears exactly two times.
		aabcdd contains two a and two d, but it only counts once.
		abcdee contains two e.
		ababab contains three a and three b, but it only counts once.

		Of these box IDs, four of them contain a letter which appears exactly twice, and three of them contain a letter which appears exactly three times. Multiplying these together produces a checksum of 4 * 3 = 12.

		What is the checksum for your list of box IDs?*/

public class Day2Part1 {
	public static void main(String[] args) throws IOException {
		String fileName = "input.txt";
		List<String> data = Files.readAllLines(Paths.get("src" + File.separator + "day2" + File.separator + fileName));
		int twoLetters = 0, threeLetters = 0, counter;

		for (String s : data) {
			Character c;
			boolean twoLettersFlag = true, threeLettersFlag = true;
			for (int i = 0; i < s.length() - 1; i++) {
				counter = 0;
				c = s.charAt(i);
				if (c.toString().equals(" ")) {
					continue;
				}

				for (int j = i + 1; j < s.length(); j++) {
					if (c == s.charAt(j)) {
						counter++;
						if (counter > 2) {
							s = s.replaceAll(c.toString(), " ");
							break;
						}
					}
				}

				if (counter == 1 && twoLettersFlag) {
					twoLetters++;
					s = s.replaceAll(c.toString(), " ");
					twoLettersFlag = false;
				} else if (counter == 2 && threeLettersFlag) {
					threeLetters++;
					s = s.replaceAll(c.toString(), " ");
					threeLettersFlag = false;
				}

				if (!twoLettersFlag && !threeLettersFlag) {
					break;
				}
			}
		}
		System.out.println(twoLetters * threeLetters);
	}
}