package Condition;

import java.util.Scanner;

public class If2
{
	public static void main(String[] args)
	{
		int num =0;
		//사용자에게 입력을 받자
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		num = sc.nextInt();	//사용자가 입력한 숫자를 num 변수에 저장 
		
		//System.out.println("입력한 숫자는"+num);
		if(num<10)
		{
			System.out.println("숫자는 10보다 작다");
		}
	}
}
