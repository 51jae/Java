package Condition;

public class Ifelse1
{
	public static void main(String[] args)
	{
		//if(){}: ()조건이 맞으면 {}실행
		//조건이 틀려도 실행할 부분
		//조건이 맞을때 실행할 코드와 조건이 틀릴때 실행할 코드
		//else{}
		if(false)
		{
			System.out.println("조건이 맞을때 실행할 코드");
		}
		else 
		{
			System.out.println("조건이 틀릴때 실행할 코드");
		}
		//if() 조건이 틀렸을 때 그 다음 조건을 검사 하고 싶으면
		if(99<10)
		{
			System.out.println("10보다 작다");
		}
		else if(99<100)
		{
			System.out.println("100보다 작다");
		}
		else if(99<1000)
		{
			System.out.println("1000보다 작다");
		}
		else
		{
			System.out.println("그 밖에");
		}
	}
}
