package lotteryTicket;
import java.util.Random;


public class LottoGenerator {

	public static void main(String[] args) {

	}

	public static int[] getRndmNums() {
		Random rand = new Random();
		int upperbound = 99;
		int[] rndm_nums = new int[8];
		
		for (var i = 0; i < rndm_nums.length; i++) {
			rndm_nums[i] = rand.nextInt(upperbound);
		}
		
		return rndm_nums;
	}

}
