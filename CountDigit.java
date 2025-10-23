package logic.java;
import java.util.Scanner;


public class CountDigit {
	public static void main(String[] args) {
		System.out.println("enter any number ");
		Scanner sc= new Scanner(System.in);
		long n=sc.nextInt();
		long count=0;
		
		while(n>0) {
			n=n/10;
			count++;
		}
		System.out.println(count);
	}

}
