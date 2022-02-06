import java.util.Scanner;
public class Main
{
    static void EvenFun(int Num){
        System.out.print("Even number");
    }
    
    static void OddFun(int Num){
        System.out.print("Odd number");
    }
    
    
	public static void main(String[] args) {
	    int Num;
		Scanner sc = new Scanner(System.in);		
		System.out.print("Please Enter a Number: ");
		Num = sc.nextInt();
		if(Num%2 == 0)
		EvenFun(Num);
		else
		OddFun(Num);
	}
}

