import java.util.Scanner;

public class ConvertSecs{
	public static void main(String[] args){
		Scanner in= new Scanner (System.in);
		System.out.print("Enter number of seconds:");
		int seconds=in.nextInt();
		int hours=seconds/3600;
		int minutes=seconds%3600/60;
		int remseconds=seconds%60;
		System.out.printf("Time: %d hour(s),%d minute(s),%d second(s)",hours,minutes,remseconds);
	}
}
