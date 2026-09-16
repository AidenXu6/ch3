import java.util.Scanner;

public class ConvertTemp{
	public static void main(String[]args){
		
		Scanner in= new Scanner(System.in);
		System.out.print("Temperature in Celcius:");
		double celcius=in.nextDouble();
		double farenheit=(celcius*1.8)+32;
		System.out.printf("Temperature in Farenheit: %f", farenheit);
		
	}
}
