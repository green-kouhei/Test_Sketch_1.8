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
			int v = 0;

			// インスタンスゾーン
			BigInteger b1, b2, b3, b4, b5, b6, b7, b8, b9;
			b1 = new BigInteger(one);
			b2 = new BigInteger(one);
			b3 = new BigInteger("1");
			b4 = new BigInteger("10");
			b5 = new BigInteger("");
			b6 = new BigInteger("-1");
			b7 = new BigInteger("");

			// 初期設定
			b2 = b2.subtract(b3);// b2-1の処理

			// 階乗ループ
			for (int count = 1; count < i - 1; count++) {
				b1 = b1.multiply(b2);// 階乗
				b2 = b2.subtract(b3);// b2-1の処理
			}
			System.out.println(b1);// デバッグ用
			// マイナスになるまでどんどん引いてく
			/*
			 * b5 階乗の答え b４ 10（*10してく） b６ マイナスの判定用
			 * 
			 */
			for (b5 = b1;; b5.multiply(b4)) {

				b5.subtract(b4);// 引き算

				switch (b5.compareTo(b6)) {// 比べる

				/*
				 * b5 < -1 のときに - 1 を返す b5 = -1 のときに 0 を返す b5 > -1 のときに 1 を返す
				 */

				case (1):
					//100
					b5.divide(b4);
					break;
				case(0):
					//割り算
					//階乗の答え➗１０(＊x)
					b5.divide(b4);
					break;
				default:
					v++;
					break;
				}
				System.out.print(b5);
			}
			//System.out.print(b5);
			// 例外処理
		} catch (NullPointerException e_1) {
			System.out.println("NullPointerException");
		} catch (NumberFormatException e_2) {
			System.out.println("数字を入力してください");
		}

	}
}
