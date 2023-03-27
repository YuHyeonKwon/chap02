package sec07;

public class Q1_ { // class s

	public static void main(String[] args) { // main s
		// 학생명 배열
		String[] names = {"최태원","이경선","배준섭","홍원표","김성현","우상현","심미안"};
		
		// 점수 배열
		int[] scores = new int[] { 87, 95, 100, 65, 70, 84, 69 };
		
		int sum = 0;
		
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("1.총점: " + sum);
		double avg = (double)sum/scores.length;
		System.out.printf("2.평균: \"%.1f\"점 입니다.",avg);
		
		int top = 0;
		for (int i = 0; i < scores.length; i++) {
			if(scores[i] > top ) {
				top = scores[i];
			}
		}
		System.out.println("\n최고점은 "+ "\"" + top + "\"점 입니다.");
		System.out.println("최고 성적은 "+names[2]+"님 입니다.");
			
		
	} // main e

} // class e}
