package sec06;

/**
 * 2중 for 문
 */
public class GuguDan { // class s

	public static void main(String[] args) { // main s

		// 구구단 세로
		for (int i = 2; i <= 9; i++) { // 2단~9단
			System.out.println("[" + i + "]단");
			for (int j = 1; j <= 9; j++) { // 1~9 매단 마다
				System.out.println(i + "*" + j + "=" + (i * j));
			}
		}

	} // main e

} // class e
