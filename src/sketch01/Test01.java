package sketch01;//つり目

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01 {

	// public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int n = Integer.parseInt(line);
		try {
			if (0 <= n | n<= 10) {
				for (int i = 0; i < n; i++) {
					System.out.print("Ann");
				}
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("範囲外です");
		}
	}
}
