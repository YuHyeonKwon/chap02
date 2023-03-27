package sec06;

import java.util.Scanner;

public class LoginCheck { // class s

	public static void main(String[] args) { // main s
//		String id = "java";
//		int pw = 1234;

		Scanner scanner = new Scanner(System.in);
		
//		System.out.print("아이디를 입력: ");
//		String 아이디 = scanner.nextLine();
//		if( id .equals (아이디)) {
//			System.out.print("비밀번호 입력: ");
//			int 비밀번호 = scanner.nextInt();
//			if( pw == 비밀번호) {
//				System.out.println("로그인 되었습니다.");
//			}else {
//				System.out.println("비밀번호가 틀렸습니다.");
//			}
//		}else {
//			System.out.println(" 틀렸습니다.");
//		}
		
		System.out.println("아이디를 입력하세요.");
		String id = scanner.nextLine();

		if(id.equals("java")) {
			System.out.println("패스워드를 입력하세요.");
			String pw = scanner.nextLine();
			if(pw.equals("1234")) {
				System.out.printf("%s님 환영합니다.\n", id);
			}else {
				System.out.println("비밀번호가 올바르지 않습니다.");
			}
		}else {
			System.out.println("계정이 올바르지 않습니다.\n");
		}
	} // main e

} // class e
