package sec06;

public class ForContinue { // class s

	public static void main(String[] args) { // main s
		
		for(int i=1; i<=10; i++) {
			if(i%2 !=0) {
				continue;					// 다시 for문으로 돌아감
			}
			System.out.print(i + " ");
		}
	} // main e

} // class e
