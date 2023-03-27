package sec03;
/**
 * 특정 위치의 문자를 알고 싶다면 charAt ( ) 메소드 사용
 * 인덱스 : 0에서부터 ' 문자열의 길이 -1 ' 까지의 번호
 */
public class CharAt { // class s

	public static void main(String[] args) { // main s
		String ssn = "9506241230123";
		char sex = ssn.charAt(6);
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
			
		}
	} // main e

} // class e
