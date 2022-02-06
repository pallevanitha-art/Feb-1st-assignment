import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
      int number;
      char ch;
      int fact=1;
	  do
	  {
	  Scanner num = new Scanner(System.in);
	  System.out.print("Enter a Number: ");
	  number=num.nextInt();
	  
      while(number >= 1)
      {
        fact = fact * number;
        number--;
      }
      System.out.println("The factorial of a num is "+ fact);
       System.out.print("Enter the option : ");
       ch = num.next().charAt(0);
	  }while(ch == 'y' || ch == 'Y');
	  
	}
}
