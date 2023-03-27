package sec07;

public class Array21SelectionSort { // class s

	public static void main(String[] args) { // main s
		/**
		 * [선택정렬] 내림차순 정력
		 */
		int[] age = null;
		int small = 0;		// 임시보관변수
		age = new int[] { 1, 3, 2, 5, 4 };

		for (int i = 0; i < age.length-1; i++) {		// i는 자리수

			for (int j = i + 1; j < age.length; j++) {	// j는 비교한다

				if (age[i] < age[j]) {
					small = age[i];
					age[i] = age[j];
					age[j] = small;
				}
			}
		}
		for (int i : age) {
			System.out.println(i + "\t");
		}
		
		/**
		 * 정렬된수 5 1 2 3 4
		 * 정렬된수 5 4 1 2 3
		 * 정렬된수 5 4 3
		 * 정렬된수 5 4 3 2
		 * 정렬된수 5 4 3 2 1
		 */
	} // main e

} // class e
