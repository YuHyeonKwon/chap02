package sec06;

/*
 * 1~10 짝수의 합
 */
public class While1To10Sum { // class s

	public static void main(String[] args) { // main s
		int sum = 0;

		int i = 1;

		while (true) {
			if (i % 2 == 0) {
				sum += i;
			}
			if (i > 10) {
				break;
			}
			i++;

		} // while e

//		while(i<=10) {
//			if (i % 2 == 0 ) {
//				sum += i;
//			}
//			i++;
//		}
		System.out.println("1~" + (i - 1) + "합 : " + sum);

	} // main e

} // class e
