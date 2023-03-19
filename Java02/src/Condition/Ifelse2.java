package Condition;

public class Ifelse2
{
	public static void main(String[] args)
	{
		int num = 99;
		
		//10보다 작은지 , 100보다 작은지 , 1000이상인지
		//if 만 쓰기
		if(num < 10)
		{
			System.out.println("10보다 작다");
		}
		if(num < 100)
		{
			System.out.println("100보다 작다");
		}
		if(num < 1000)
		{
			System.out.println("1000보다 작다 ");
		}
		System.out.println("==========================");
		//if ~ else if ~ else :세트
		if(num<10)
		{
			System.out.println("10보다 작다");
		}
		else if (num < 100)
		{
			System.out.println("100보다 작다");
		}
		else if (num < 1000)
		{
			System.out.println("1000보다 작다");
		}
		else
		{
			System.out.println("그밖에");
		}
		System.out.println("===================");
		//if와 관계 연산자
		if(num<10)
		{
			System.out.println("10보다 작다");
		}
		if(num >= 10 && num < 100)
		{
			System.out.println("10보다 이상 100보다 작다");
		}
		if(num>=100 && num< 1000)
		{
			System.out.println("100 이상 1000보다 작다");
		}
	}
}
