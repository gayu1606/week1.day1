package week1.day1.assignments;

public class PrimeNumber {
	//2,3,5,7,11,13,17,19,23,29,31,27
	//number which is divisible by 1 and itself
	
	public static void main(String[] args) {
		
	
	int input = 19;
	boolean flag = false;
	
	for (int i=2;i<=19;++i)
	{
		if (input%i == 0)
		{
			System.out.println("not a prime number");
			flag = true;
			break;
		}
	{
	}
	}
		if(!flag)
		{
			System.out.println("prime number");
		}
		
	}
		

}
