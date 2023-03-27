package sec04;

public class IfDiceExample { // class s

	public static void main(String[] args) { //main s
		// 0.0 ~ 0.1 사이의 난수 발생 ( random 메소드 )
		int num = (int)(Math.random()*6) + 1;		// double -> int 변환 ( 타입변환 )
													// 1~6 랜덤으로 뽑힘 ( 주사위 )
		if(num == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if(num == 2) {
			System.out.println("2번이 나왔습니다.");
		} else if(num == 3) {
			System.out.println("3번이 나왔습니다.");
		} else if(num == 4) {
			System.out.println("4번이 나왔습니다.");
		} else if(num == 5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}
	} // main e

} // class e
