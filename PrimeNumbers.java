package week1.day1;

public class PrimeNumbers {
	public static void main(String[] args) {
		int n = 31;
		for(int i =2; i<=(n-1); i++)
		{
			if (n%i==0) {
				System.out.println("This number is not prime");
				break;
			}
				else 
				{
				System.out.println("This numner is prime");
				break;				}
		
			
			}
	}


}