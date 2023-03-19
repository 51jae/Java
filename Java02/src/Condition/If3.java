package Condition;

import java.util.Scanner;

public class If3
{
	public static void main(String[] args)
	{
		// 사용자에게 점수를 입력 받고
		// 점수가 90이상이면 우등생 출력
		int score = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		score = sc.nextInt();
		if(score >=90)
		{
			System.out.println("우등생");
		}
	}
}
