package lotteryTicket;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveToTxt {

	public static void main(String[] args) {
	}
	
	public static String saveToTxt(String arg) {
		String to_write = arg;
		try {
			
			File tFile = new File("./results.txt");
			
			if (tFile.createNewFile()) {
				System.out.println("\nFile " + tFile.getName() + " has been created.");
				
				try {
					
					FileWriter tWriter = new FileWriter("results.txt");
					
					tWriter.write(to_write);
					tWriter.close();
					
					return "\nSave successful!";

				} catch (IOException e) {
					e.printStackTrace();
					return "\nError occurred. Please try again.";
				}
			} else {
				System.out.println("\nFile already exists.");
				try {
					FileWriter tWriter = new FileWriter("./results.txt");
					
					tWriter.write(to_write);
					tWriter.close();
					
					return "\nSave successful!";

				} catch (IOException e) {
					e.printStackTrace();
					return "\nError occurred. Please try again.";
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			return "\nError occurred. Please try again.";
		}
	}

}
