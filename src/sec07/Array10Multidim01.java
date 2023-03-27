package sec07;

public class Array10Multidim01 { // class s

	public static void main(String[] args) { // main s
		// 각 반의 학생 수가 3명으로 동일할 경우 점수 저장을 위한 2차원 배열 생성
		int[][] mathScorse = new int[2][3]; // [2] 반 , [3] 학생

		// 배열 항목 값 변경
		mathScorse[0][0] = 80; // 1반 0번학생
		mathScorse[0][1] = 83; // 1반 1번학생
		mathScorse[0][2] = 85; // 1반 2번학생

		mathScorse[1][0] = 86; // 2반 0번학생
		mathScorse[1][1] = 90; // 2반 1번학생
		mathScorse[1][2] = 92; // 2반 2번학생

		// 전체 학생의 수학 평균 구하기
		int totalStudent = 0;
		int totalMathSum = 0;

		for (int i = 0; i < mathScorse.length; i++) { // 첫번째 반 for 문
			totalStudent += mathScorse[i].length; // 학생 , 반
			for (int k = 0; k < mathScorse[i].length; k++) { // 두번째 학생 , 성정 for 문
				totalMathSum += mathScorse[i][k];
			}
		}
		double totalMathAvg = (double) totalMathSum / totalStudent;
		System.out.println("전체 학생의 수학 평균 점수: " + totalMathAvg);
		System.out.println();

		for (int i = 0; i < mathScorse.length; i++) {
			for (int j = 0; j < mathScorse[i].length; j++) {
				System.out.print(mathScorse[i][j] + " ");
			}
			System.out.println();
		}
		int a = 0;
		
		for(int i = 0; i < mathScorse.length; i++) {
			for(int j = 0; j < mathScorse[i].length; j++) {
				if(mathScorse[i][j] >= 90 ) {
					a++;
				}
			}
		}
		System.out.println("90점 이상인 한생 수: " + a +"명");		// 첫 for문에서 출력해야 정확하게 출력됨.
	} // main e

} // class e
