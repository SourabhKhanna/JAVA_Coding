package LeetCode_Top_Interview_Questions;
























import java.io.*;
import java.util.Scanner;

public class CountWord {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		String line = scan.next();
		int count = 0;
		FileWriter fWriter = new FileWriter("data.txt");
		fWriter.write(line);
		FileReader file = new FileReader("data.txt ");
		BufferedReader br = new BufferedReader(file);
		int countWord = 0;
		int sentenceCount = 0;
		while ((line = br.readLine()) != null) {

			String[] wordList = line.split("\\s+");

			countWord += wordList.length;

			String[] sentenceList = line.split("[!?.:]+");

			sentenceCount += sentenceList.length;

		}

	}
}
