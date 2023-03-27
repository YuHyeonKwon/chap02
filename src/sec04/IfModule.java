package sec04;
/**
 * 키보드에서 두 숫자를 받아서 값을 비교하시오
 */
import java.util.Scanner;

public class IfModule { // class s

	public static void main(String[] args) { //main s
		Scanner scanner = new Scanner(System.in);
		System.out.print("a값 입력:");
		int a = scanner.nextInt();
		
		System.out.print("b값 입력:");
		int b = scanner.nextInt();
		
		compareTwoNumber(a,b);
		

		if (a > b) {
			System.out.println("a가 큽니다.");
		} else {
			System.out.println("b가 급니다.");
		}
		
		// 자원 닫기
		//scanner.close();
		
		
	} // main e
	/**
	 * 두 수를 비교해주는 함수
	 * @param a
	 * @param b
	 */
	private static void compareTwoNumber(int a, int b) {
		if(a > b) {
			System.out.println("첫 번째 숫자가 큽니다.");
		} else if(a < b) {
			System.out.println("두 번째 숫자가 큽니다.");
		} else {
			System.out.println("두 수가 같습니다.");
		}
	}
} // class e
