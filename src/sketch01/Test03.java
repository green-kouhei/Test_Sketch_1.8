package sketch01;//セーラー服

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();// 入力１

		int n = Integer.parseInt(line);
		String v[] = new String[11];
		int c = n;

		try {
			if (n < 2 | n > 10) {// 入力１制限確認
				System.out.println("範囲外です");

			} else {
				for (int i = 1; i <= n; i++) {// 入力１
					v[i] = br.readLine();// 入力その後

				}

				
				for (int t = 1; t <= n; t++) {
					switch (c) {
					case (1):
						System.out.print(v[t]);
						break;
					default:
						System.out.print(v[t] + "_");
						c--;
						break;

					}
				}
			}

		} catch (IndexOutOfBoundsException e) {
			System.out.println("範囲外です");
		}
	}
}
