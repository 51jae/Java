package Condition;

import java.util.Scanner;

public class Ifelse3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		// 1. 20세 이상 성인, 14~19세 청소년 , 14세만 어린이	
		int age= 0;
		System.out.println("나이입력 : ");
		age = sc.nextInt();
		if(age >= 20)
		{
			System.out.println("성인");
		}
		else if(age >=14 || age >=19)
		{
			System.out.println("청소년");
		}
		else {
			System.out.println("어린이");
		}
		//2. 학점계산 (90이상a,80b,70c,나머지 f)
		int score = 0;
		System.out.println("점수 입력 : ");
		score = sc.nextInt();
		if(score>=90)
		{
			System.out.println("A");
		}
		else if(score >=80)
		{
			System.out.println("B");
		}
		else if (score >=70)
		{
			System.out.println("C");
		}
		else
		{
			System.out.println("F");
		}
		
		//3. 비밀번호를 정해놓고 사용자가 비밀번호를 입력해서 맞추면 '비밀번호가 맞습니다.'
		//틀리면 비밀번호가 다릅니다
		int screat = 1234;
		System.out.println("비밀번호 입력 : ");
		int pwd = sc.nextInt();
		if(pwd == screat)
		{
			System.out.println("비밀번호가 맞습니다");
		}
		else
		{
			System.out.println("비밀번호가 틀립니다.");
		}
		int year ;
		System.out.println("년도 입력 ");
		year = sc.nextInt();
		if((year % 4 ==0) && (year % 100 ==0) || (year % 400 ==0))
		{
			System.out.println("윤년");
		}
		else
		{
			System.out.println("아님");
		}
		System.out.println("=============");
//		if(year % 4==0)
//		{
//			System.out.println("윤년");
//		}
//		else if(year % 100==1)
//		{
//			System.out.println("윤년");
//		}
//		else if(year % 400 ==0)
//		{
//			System.out.println("윤년");
//		}
//		else {
//			System.out.println("아님");
//		}
	}
}
