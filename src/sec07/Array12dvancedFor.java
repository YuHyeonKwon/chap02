package sec07;

public class Array12dvancedFor { // class s

	public static void main(String[] args) { // main s
		// 배열 변수 선언과 배열 생성
		int[] scores = {95, 71, 84, 93, 87 };
		// 배열 항목 전체 합 구하기
		int sum = 0;
		for (int score : scores) {		//향상된 for 문 , int 타입 scores 값을 score로 하나씩 가지고온다
			sum = sum + score;			// -> sum += score; ( 이거로많이사용 )
		}
		System.out.println("점수 총합 = " + sum);
		// 배열 항목 전체 평균 구하기
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);
		
	} // main e

} // class e
