import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int Number, Count=0;
		Scanner sc = new Scanner(System.in);		
		System.out.print("Please Enter any Number: ");
		Number = sc.nextInt();
		
		while(Number > 0) {
			Number = Number / 10;
			Count = Count + 1; 
		}
		System.out.format("Number of Digits in a Given Number "+ Count);
	}
}
