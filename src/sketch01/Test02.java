package sketch01;//ショートヘア

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line1 = br.readLine();
		String line2 = br.readLine();

		int v1 = Integer.parseInt(line1);
		int v2 = Integer.parseInt(line2);
		try {
			if (1 <= v1 | v1 <= 101 && 1 <= v2 | v2 <= 101) {
				System.out.println(v1 + v2);
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("範囲外です");
		}
	}
}
