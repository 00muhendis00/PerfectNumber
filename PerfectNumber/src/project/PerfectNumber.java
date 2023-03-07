package project;
import java.util.Scanner;
public class PerfectNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number,result=1,total = 0;
		
		System.out.print("Enter a value ");
		number = input.nextInt();
		
		for(int i=1;i<number;i++) {
			result = number % i;
			if(result == 0) {
				total += i;
				
			}
			
		}
		if(total == number) {
			System.out.println(number + " is a perfect number!");
		}
		else {
			System.out.println(number + " is not a perfect number!");
		}
	}
}
