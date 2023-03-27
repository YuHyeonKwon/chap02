package sec03;

public class LengthExample { // class s

	public static void main(String[] args) { // main s
		String ssn = "9506241230123";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민등록번호 자릿수가 맞습니다.");
		} else {
			System.out.println("주민등록번호 자릿수가 틀립니다.");
		}
	} // main e

} // class e
