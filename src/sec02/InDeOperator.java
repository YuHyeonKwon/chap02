package sec02;
/**
 * 산술 연산자, 증감연산자 예제
 */
public class InDeOperator { // class s

	public static void main(String[] args) { // main s
		int x = 10;
		int y = 10;
		int z;
		
		x++;	// 11
		++x;	// 12
		System.out.println("x=" + x);	// 12
		
		System.out.println("------------------------------");
		y--;	// 9
		--y;	// 8		
		System.out.println("y=" + y);	// 8
		
		System.out.println("------------------------------");
		z = x++;
		System.out.println("z=" + z);	// 12
		System.out.println("x=" + x);	// 13
		
		System.out.println("------------------------------");
		z = ++x;
		System.out.println("z=" + z);	// 14
		System.out.println("x=" + x);	// 14 , y= 8
		
		System.out.println("------------------------------");
		z = ++x + y++;
		System.out.println("z=" + z);	// 23
		System.out.println("x=" + x);	// 15
		System.out.println("y=" + y);	// 9
		
		
	} // main e

} // class e
