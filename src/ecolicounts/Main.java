package ecolicounts;

import java.io.*;
import java.util.*;

import org.apache.commons.io.*;

public class Main {

	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			String fileName = in.nextLine();
			File file = new File(fileName);
			String strData = FileUtils.readFileToString(file);
			Ecoli dna = new Ecoli(strData);
			StringBuilder sb = new StringBuilder();
			sb.append("#A = " + dna.getNumA() + "\n");
			sb.append("#C = " + dna.getNumC() + "\n");
			sb.append("#G = " + dna.getNumG() + "\n");
			sb.append("#T = " + dna.getNumT());
			System.out.println(sb);
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}