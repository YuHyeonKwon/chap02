package sec03;
/**
 * index ( ) 메소드 : 문자열에서 특정 문자열의 위치를 찾고자 할 때 사용
 * 					주어진 문자열이 시작되는 인덱스를 리턴
 *
 */
public class IndexOfContains { // class s

	public static void main(String[] args) { // main s
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		String subString = subject.substring(location);
		System.out.println(subString);
		
		location = subject.indexOf("자바");
		if(location != -1) {
			System.out.println("자바와 관련된 책이군요.");
		}else {
			System.out.println("자바와 관련 없는 책이군요.");
		}
		
		boolean result = subject.contains("자바");
		if(result) {
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련 없는 책이군요.");
		}
		
	} // main e

} // class e
