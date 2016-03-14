package sketch01;//セーラー服

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();

		int n = Integer.parseInt(line);
		String v[] = new String[10];

		try {
			if (2 <= n | n <= 10) {
				for (int i =0;i<n;i++) {
					v[n]=br.readLine();
				}

			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("範囲外です");
		}
	}
}
