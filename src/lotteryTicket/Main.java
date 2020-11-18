package lotteryTicket;

public class Main {
	public static void main(String[] args) {
		int[] lotto_balls = LottoGenerator.getRndmNums();
		int[] user_balls = LottoGenerator.getRndmNums();
		int matches = getMatchingBalls(lotto_balls, user_balls);
		
		if (matches <= 2) {
			System.out.println("You did not win.");
		}
		if (matches == 3) {
			System.out.println("You won R500.");
		}
		if (matches == 4) {
			System.out.println("You won R1_500.");
		}
		if (matches == 5) {
			System.out.println("You won R2_500.");
		}
		if (matches == 6) {
			System.out.println("You won R5_000.");
		}
		if (matches == 7) {
			System.out.println("You won R10_000.");
		}
		if (matches == 8) {
			System.out.println("You won R20_000.");
		}
		
		System.out.println(String.valueOf(matches));
	}
	
	public static int getMatchingBalls(int[] lotto_balls, int[] user_balls) {
		int curs_lotto = 0;
		int curs_user = 0;
		int matches = 0;
		
		for (var i = 0; i <= lotto_balls.length -1; i++) {
			curs_lotto = lotto_balls[i];
			for (var j = 0; j <= user_balls.length -1; j++) {
				curs_user = user_balls[j];
				if (curs_lotto == curs_user) {
					matches += 1;
				}else {
					continue;
				}
			}
		}
		
		return matches;
		
	}
	
	
}