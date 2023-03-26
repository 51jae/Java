package loop;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args)

	{
		Scanner sc = new Scanner(System.in);
		
		//1.1~10 중 짝수만 출력
		for(int i=1;i<=10;i++)
		{
			if(i % 2 ==1)
			{
				continue;
			}
			System.out.println("짝수 : "+i);
		}
		//2.비밀번호 맞추기 (기회 5번 이 넘어가면 정지 , 정수, 맞추면 맞췄다 하고 종료, 기회를 모두 사용시 접속불가)
		System.out.println("비번 입력 : ");
		int answer = 1234;	//비밀번호
		int input=0;	//비밀번호를 입력할 공간
		input =sc.nextInt();
		int input1=0;
		int try1 =0;
		
		
		
	}

}
