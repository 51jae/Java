package review;

import java.util.Scanner;

public class Reivew {

	public static void main(String[] args) 
	{
		//if 문
		//if ~ else if ~ else
		//조건이 맞으면 실행 , 틀리면 무시
		//if (){} : () 에는 조건식 {} 에는 코드
		
		//예제 : 버스카드 20세이상이면 성인 천원 14~19 청소년 650
		//13 세 이하 400
		 
		int age = 19;
		int money = 0;
		if(age > 19 )
		{
			//나이가 19보다 크면 실행
			System.out.println("성인");
			money = 1000;
		}
		else if(age > 13)
		{
			//나이가 19보다는 크지않고 13 보다는 크면 실행 코드
			System.out.println("청소년");
			money =650;
		}
		else
		{
			//나이가 19보다 크지않고 13 보다 크지 않으면 
			System.out.println("어린이");
			money = 400;
		}
			System.out.println(money+"원");
			//윤년
			int year =0;
			Scanner sc = new Scanner(System.in);
			System.out.println("년도 입력 : ");
			year = sc.nextInt();
			if((year % 4 ==0 && year % 100 != 0)|| year % 400 ==0)
			{
				System.out.println("윤년");
			}
			else 
			{
				System.out.println("윤년 아님");
				
			}
			
	}

}
