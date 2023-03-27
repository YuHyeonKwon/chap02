package sec07;

/**
 * - NullPointerExceptionExample - 메모리 공간이 안만들어진 상태에서 특정 요소의 값에 접근할 경우 발생 - 참조하는
 * 메모리 공간이 없는상태
 */
public class Array00NullPointerExceptionExample { // class s

	public static void main(String[] args) { // main s
		int[] intArray = null;
		intArray = new int[3]; // 3칸자리 공간을 만들어줌
		intArray[0] = 10; //
		System.out.println(intArray[0]);

		String str = null;
		str = "안녕하세요."; // 메모리에 값이 담김
		System.out.println("총 문자 수: " + str.length()); // NullpointerException (str이 null 일때 발생 )

	} // main e

} // class e
