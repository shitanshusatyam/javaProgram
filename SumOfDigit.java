package logic.java;
import java.util.Scanner;

public class SumOfDigit {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int a=sc.nextInt();
	int sum=0;
	
	
	for(int i=0;i<=a;i++) {
		
		sum+=i;
	}
	System.out.println(sum);
}
}
