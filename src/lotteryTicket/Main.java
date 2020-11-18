package lotteryTicket;

public class Main {
	public static void main(String[] args) {
		int[] lotto_balls = LottoGenerator.getRndmNums();
		int[] user_balls = LottoGenerator.getRndmNums();
		int matches = getMatchingBalls(lotto_balls, user_balls);
		
		String print_to_txt = "You got " + String.valueOf(matches) + " matches.";
		
		try {
			switch (matches) {
			case 0:
				System.out.println("You did not win.");
				break;
			case 1:
				System.out.println("You won R50.");
				break;
			case 2:
				System.out.println("You won R250.");
				break;
			case 3:
				System.out.println("You won R500.");
				break;
			case 4:
				System.out.println("You won R1_500.");
				break;
			case 5:
				System.out.println("You won R2_500.");
				break;
			case 6:
				System.out.println("You won R5_000.");
				break;
			case 7:
				System.out.println("You won R10_000.");
				break;
			case 8:
				System.out.println("You won R20_000.");
				break;
			default:
				break;
			}

		} catch (Exception e) {
			System.out.println("Error occurred in finding a match.\n" + e);
		} finally {
			System.out.println("Total matches found: " + String.valueOf(matches));
			System.out.println(SaveToTxt.saveToTxt(print_to_txt));
			System.out.println("### END OF PROGRAM ###");
		}
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