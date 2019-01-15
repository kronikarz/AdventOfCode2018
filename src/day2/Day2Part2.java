package day2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

		/*Part Two
		The boxes will have IDs which differ by exactly one character at the same position in both strings. For example, given the following box IDs:

		abcde
		fghij
		klmno
		pqrst
		fguij
		axcye
		wvxyz

		The IDs abcde and axcye are close, but they differ by two characters (the second and fourth). However, the IDs fghij and fguij differ by exactly one character, the third (h and u). Those must be the correct boxes.

		What letters are common between the two correct box IDs? (In the example above, this is found by removing the differing character from either ID, producing fgij.)*/

public class Day2Part2 {
	public static void main(String[] args) throws IOException {
		String fileName = "input.txt";
		List<String> data = Files.readAllLines(Paths.get("src" + File.separator + "day2" + File.separator + fileName));

		StringBuilder sb;
		String commonLetters = "";

		for (int baseStringIndex = 0; baseStringIndex < data.size() - 1; baseStringIndex++) {
			for (int comparingStringIndex = baseStringIndex + 1; comparingStringIndex < data.size(); comparingStringIndex++) {
				sb = new StringBuilder();

				for (int charPosition = 0; charPosition < data.get(baseStringIndex).length(); charPosition++) {
					char base = data.get(baseStringIndex).charAt(charPosition);
					char compare = data.get(comparingStringIndex).charAt(charPosition);

					if (base == compare) {
						sb.append(base);
					}
				}
				if (commonLetters.length() < sb.length() || commonLetters.equals("")) {
					commonLetters = sb.toString();
				}
			}
		}
		System.out.println(commonLetters);
	}
}