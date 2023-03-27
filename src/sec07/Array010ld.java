package sec07;

/**
 * 세 과목의 평균 구하기
 */
public class Array010ld { // class s

	public static void main(String[] args) { // main s
		int[] score = {80, 75, 90};
		
		int sum = 0;
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.println("총점: " + sum);
		double avg = (double)sum / 3.0;			// double 타입으로 변환 ( int는 소수점 버려서 )
		
		System.out.println("1.평균: " + avg);
		System.out.printf("2.평균: %.2f \n" , avg);		// 소수점 2번째 자리까지
		System.out.printf("3.평균: " + Math.round(avg * 100)/100.0);
		System.out.println();
		System.out.println(String.format("4.평균: %.2f", avg));
		
		// Math.round()는 소숫점 1번째 자리에서 반올림한 정수를 반환함.
		// 평균(81.66666666667)
	} // main e

} // class e
