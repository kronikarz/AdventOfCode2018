package day1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		File file = new File("src" + File.separator + "day1" + File.separator + "input1.txt");
		Scanner sc = new Scanner(file);

		int freq = 0;

		while (sc.hasNextLine()) {
			freq += Integer.parseInt(sc.nextLine());
		}
		System.out.println(freq);
	}
}
