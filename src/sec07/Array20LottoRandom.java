package sec07;

import java.util.Scanner;

public class Array20LottoRandom { // class s

	public static void main(String[] args) { // main s

		// 배열 선언 (6개 공간 담는 배열 선언 ( 공간확보 ))
		int[] numArr = new int[6];

		// 세트 입력(Scanner)
		Scanner scan = new Scanner(System.in); // System
		System.out.println("몇 세트의 난수를 발생시키겠습니다?");
		int set = scan.nextInt(); // 정수읽기

		// while
		while (set > 0) {
			for (int i = 0; i < numArr.length; i++) {	// 배열 갯수 만큼 돌림
				numArr[i] = (int) (Math.random() * 45) + 1;
				for (int j = 0; j < i; j++) {
					if (numArr[j] == numArr[i]) {
						i = i - 1;
						break;
					}
				}
			}
			// 한 세트 출력 ( 향상된 for문)
			for (int i : numArr) {
				System.out.print(i + "\t");
			}
			System.out.println("");
			set = set - 1;		// -1씩 차감 (set)
		}

	} // main e

} // class e
