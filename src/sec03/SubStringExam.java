package sec03;
/**
 * subString( ) 메소드 : 문자열에서 특정 위치의 문자열을 잘라내어 가져오고 싶을 때 사용
 *
 */
public class SubStringExam { // class s

	public static void main(String[] args) { // main s
		String ssn = "880815-1234567";
		// 8 8 0 8 1 5 - 1 2 3  4  5  6  7
		// 0 1 2 3 4 5   6 7 8  9 10 11 12  
		
		String firstNum = ssn.substring(0,6);	//0~6 까지
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);	//7~나머지 
		System.out.println(secondNum);
		
	} // main e

} // class e
