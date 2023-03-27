package sec04;
/**
 * 키보드에서 두 숫자를 받아서 값을 비교하시오
 */
import java.util.Scanner;

public class Q1_Ex1 { // class s

	public static void main(String[] args) { //main s
		Scanner scanner = new Scanner(System.in);
		System.out.print("a값 입력:");
		int a = scanner.nextInt();
		
		System.out.print("b값 입력:");
		int b = scanner.nextInt();
		
		if (a > b) {
			System.out.println("a가 큽니다.");
		} else {
			System.out.println("b가 급니다.");
		}
		
		// 자원 닫기
		//scanner.close();
		
		
	} // main e

} // class e
