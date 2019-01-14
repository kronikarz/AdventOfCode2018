package day2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Day2Part2 {
	public static void main(String[] args) throws IOException {
		String fileName = "input.txt";
		List<String> data = Files.readAllLines(Paths.get("src" + File.separator + "day2" + File.separator + fileName));
	}
}
