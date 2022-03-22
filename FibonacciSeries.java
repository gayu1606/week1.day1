package week1.day1.assignments;

public class FibonacciSeries {
	
	//0,1,1,2,3,5,8,13,21,34
	
	public static void main(String[] args) 
	{
		int a1 = 0 ;
		int a2 = 1 ;
		int total;
		
		for (int i=1;i <= 10;i++)
		{
			total = a1+a2;
			System.out.println(total);
			a1=a2;
			a2=total;
			
			
		}
		
		
		
	}
}
