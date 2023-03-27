package sec07;
/*
 * 배열을 사용하여 세 과목의 평균 구하기
 */
public class Array02New { // class s

	public static void main(String[] args) { // main s
		// 합계 변수
		int sum = 0;
		// 배열 변수를 선언과 동시에 초기화함
		int intArr[] = {80,75,90};
		// 이런 형태로 초기화 할수도 있음
		intArr[0] = 80;
		intArr[1] = 75;
		intArr[2] = 90;
		
		for (int i = 0; i < intArr.length; i++) {
			sum = sum + intArr[i];
			System.out.println(intArr[i]);
//			
//			for (int i = 0; i < intArr.length; i++) {		// length 배열길이
//				sum = sum + intArr[i];
//				System.out.println(intArr[i]);
//			}	
		}
		double avg = (double)sum / intArr.length;		// double 타입변환 (정수는 소숫점 제외)
		System.out.printf("agv : %.2f", avg);			// %.2 소숫점 2번째자리까지 출력
		
	} // main e

} // class e
