package sec06;

import com.sun.org.apache.bcel.internal.generic.StackConsumer;

public class For1To100Sum { // class s

	public static void main(String[] args) { // main s
		int sum = 0;
		int i;
		
		
		for (i = 1; i <=100; i++) {
			sum += i;
		}
		System.out.println("1~" + (i-1) + "합: " + sum);
	} // main e

} // class e
