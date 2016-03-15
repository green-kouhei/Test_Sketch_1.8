package sketch01;//ロングヘアセット

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x[] = new String[5];
		int c = 0;
		try {
			for (int i = 0; i < 5; i++) {
				x[i] = br.readLine();
				if (x[i].equals("yes")) {
					c++;
				}
			}
			if (c > 2) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}

		} catch (IndexOutOfBoundsException e) {
			System.out.println("範囲外です");
		}
	}
}
