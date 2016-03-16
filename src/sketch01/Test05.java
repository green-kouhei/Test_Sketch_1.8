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
		// Let's チャレンジ！！
		try {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String one = br.readLine();
			int i = Integer.parseInt(one);

			// インスタンスゾーン
			ArrayList<Integer> i_list = new ArrayList<Integer>();
			BigInteger bi = new BigInteger("a");

			for (int n = i; n > 0; n--) {
				i_list.add(n);
				System.out.println(i_list.size());// デバッグ用
			}
		} catch (NullPointerException e_1) {

		}
		catch(NumberFormatException e_2){
			System.out.println("長さが0バイトです");
		}

	}
}
