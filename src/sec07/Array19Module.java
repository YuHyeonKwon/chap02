package sec07;

public class Array19Module { // class s

	public static void main(String[] args) { // main s
		// Array
		String[] names = {"최태원","이경선","배준섭","홍원표","김성현","우상현","심미안"};
		int[] scores = new int[] { 87, 95, 100, 65, 70, 84, 69 };
		
		// 총점
		int sum = 0;
		// 평균

		// 총점 구하는 메소드 호출
		sum = sum(scores);

		// 평균 구함
		double avg= ( sum + 0.0) / scores.length;
		

		// 최고점수
		maxScore(names, scores);

	} // main e

		// 최고점 및 최고점 학생명 구하는 메소드
	private static void maxScore(String[] names, int[] scores) {
		int max = 0;				// 큰수 임시 저장 변수
		String maxName = "";		// 최고 점수의 학생 저장 변수
		
		// 최고 점수와 최고 점수 학생명 구함
		for (int i = 0; i < scores.length; i++) {	// 임의의 수와 모든 요소를 비교해가면서 큰수 찾기
			if( max < scores[i] ) {
				max = scores[i];
				maxName = names[i];
			}
		}
		System.out.printf("최고점은 \"%2d점\" 입니다. \n",max);
		System.out.println("최고 성적은 " + maxName + "님 입니다.");
}

	// 합계 계산 메소드
	private static int sum(int[] scores) {		// 반환 타입이 int형
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];
		}
		return sum;
	}

} // class e
