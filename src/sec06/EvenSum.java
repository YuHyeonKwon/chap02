package sec06;

public class EvenSum { // class s

	public static void main(String[] args) { // main s
		int sum = 0;
		int sum1 = 0;

		
		for(int i=1; i<=10; i++) {
			 if(i % 2 == 0) {
				sum += i;
			 }if(i % 3 == 0) {
				sum1 += i;
		}
		System.out.println("1 ~ 10 2의 배수 합 : " + sum);
		System.out.println("1 ~ 10 3의 배수 합 : " + sum1);
		}
//		int sum1 = 0;
//		for(int i=1; i<=10; i++) {
//			if(i % 3 == 0 ) {
//				sum1 += i;
//			}
//		}
//		System.out.println("1 ~ 10 3의배수의 합: " + sum1);
	} // main e

} // class e
