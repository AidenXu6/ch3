import java.util.Scanner;
import java.util.Random;

public class randomnum{
	public static void main(String[] args){
		Scanner in= new Scanner (System.in);
				        Random random = new Random();
				int comnum = random.nextInt(100) + 1;
				
				System.out.print("Guess what number i'm thinking of:");
				int guess=in.nextInt();
				int diff=guess-comnum;
				System.out.printf("Your number was off by: %d" ,diff);
				System.out.printf("The number was:%d",comnum);
				
		
		
		   
	}
}
