package sec07;

public class Array08RefObject { // class s

	public static void main(String[] args) { // main s
		String[] strArray = new String[3];		// String 배열
		strArray[0] = "Java";					// index 0번
		strArray[1] = "Java";					// index 1번
		strArray[2] = new String("Java");		// index 2번
		
		System.out.println( strArray[0] == strArray[1]);			// [0],[1]은 같은번지 같은곳을 바라보고있음
		System.out.println( strArray[0] == strArray[2]);			// == 주소 비교
		System.out.println( strArray[0].equals(strArray[2]));		// .equals 들어가있는 값 비교
		
		
		
	} // main e

} // class e
