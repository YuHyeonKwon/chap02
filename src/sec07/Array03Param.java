package sec07;

/**
 * [모듈화] - 평균 구하는 로직을 메소드로 분리함
 */
public class Array03Param { // class s

	public static void main(String[] args) { // main s

		int[] intArr = { 80, 75, 90 };

		// 평균을 구해주는 메소드 호출
		double avg = getSum(intArr); // 인자(argument)로 배열을 전달

		System.out.printf("\n" + "avg: %.2f", avg); // return 반환한 값 출력

	} // main e

	// 평균을 구해주는 메소드(double : 반환 타입)
	public static double getSum(int[] arr) { // 매개변수가 배열 타입
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			System.out.println(arr[i]);
		}
		double avg = (double) sum / arr.length; // double 타입으로 변환
		return avg; // 값을 반환

	}

} // class e
