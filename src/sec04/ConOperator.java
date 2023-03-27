package sec04;

public class ConOperator { // class s

	public static void main(String[] args) { // main s
//		int score = 85;
//		String str = (score >= 80) ? "80점이상" : "80점미만";
//		System.out.println(str);
		
		int a = 80;
		int b = 85;
		
		String str = (a > b) ? "a가크다." : "b가크다.";
		System.out.println(str);
		
		System.out.println(2 > 3 ? "맞아" : "틀려");
	} // main e

} // class e
