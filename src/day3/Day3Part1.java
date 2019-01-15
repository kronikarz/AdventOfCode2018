package day3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

		/* Part One
		A claim like #123 @ 3,2: 5x4 means that claim ID 123 specifies a rectangle 3 inches from the left edge,
		2 inches from the top edge,
		5 inches wide, and 4 inches tall.
		Visually, it claims the square inches of fabric represented by # (and ignores the square inches of fabric represented by .) in the diagram below:

		...........
		...........
		...#####...
		...#####...
		...#####...
		...#####...
		...........
		...........
		...........

		The problem is that many of the claims overlap, causing two or more claims to cover part of the same areas. For example, consider the following claims:

		#1 @ 1,3: 4x4
		#2 @ 3,1: 4x4
		#3 @ 5,5: 2x2

		Visually, these claim the following areas:

		........
		...2222.
		...2222.
		.11XX22.
		.11XX22.
		.111133.
		.111133.
		........

		The four square inches marked with X are claimed by both 1 and 2. (Claim 3, while adjacent to the others, does not overlap either of them.)

		If the Elves all proceed with their own plans, none of them will have enough fabric. How many square inches of fabric are within two or more claims?*/

public class Day3Part1 {
	public static void main(String[] args) throws IOException {
		String fileName = "input.txt";
		List<String> data = Files.readAllLines(Paths.get("src" + File.separator + "day2" + File.separator + fileName));
	}
}
