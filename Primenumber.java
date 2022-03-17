package Day4;

import java.util.Scanner;

//wap to check if a number is prime or not 
//prime number are divisible by 1 or itself
public class Primenumber {

	public static void main(String[] args) 
	{
		System.out.println("enter number");
		Scanner s= new Scanner(System.in);
		int i,n=s.nextInt();
		int flag=0;
		for( i=2;i<n/2;i++)
		{
			if( n%i==0) 
				{
				flag=1;
				System.out.println(" number is not prime");
				break;
				}
		}
		
		
		if(flag==0) System.out.println("its prime number");
			

	
	}
}
