import java.util.*;
import java.lang.Integer;

public class CalcColors{
	public static void main(String args[]){
		Scanner userInputStreamScanner = new Scanner(System.in);
		String userInput = "";
		System.out.print("Please Enter in the percentage opacity you wish to calculate 0 -> 100\n--->");
		System.out.println("Your opacity color prefix is \n" + hexColorPrefix(Integer.parseInt(userInputStreamScanner.nextLine().trim())));
	}

	public static String hexColorPrefix(int opactiyValue){
		//By casting to an integer we can round off to the nearest ones place
		int opactiyPercentage =  (int)(((100.0 - opactiyValue) / 100) * 255);
		//Specifing that we want to convert our base10 number into a hex base16 number
		return Integer.toString(opactiyPercentage,16);
	}
}