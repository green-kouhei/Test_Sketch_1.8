package sketch01;//水着

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.math.BigInteger;
import java.math.*;
import java.lang.NullPointerException;

public class Test05 {

	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
		// Let's
		try {
			
			// 入力
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String one = br.readLine();
			int i = Integer.parseInt(one);

			// インスタンスゾーン
			BigInteger b1, b2, b3;
			b1 = new BigInteger(one);
			b2 = new BigInteger(one);
			b3 = new BigInteger("1");

			// 初期設定
			b2 = b2.subtract(b3);// b2-1の処理

			// 階乗ループ
			for (int count = 1; count < i - 1; count++) {
				b1 = b1.multiply(b2);// 階乗
				b2 = b2.subtract(b3);// b2-1の処理
			}

			System.out.println(b1);// デバッグ用

			// 例外処理
		} catch (NullPointerException e_1) {
			System.out.println("NullPointerException");
		} catch (NumberFormatException e_2) {
			System.out.println("長さが0バイトです");
		}

	}
}
