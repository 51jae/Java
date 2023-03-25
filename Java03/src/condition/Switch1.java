package condition;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) 
	{
			//제어문 : if switch while for break continue
			//조건문 : if switch
		//if가 기본 조건문 , switch는 같은 경우만 비교(가독성)
		int num=0;
		if(num == 0)
			System.out.println("num은 0이다");
		else if(num ==1)
		{
			System.out.println("1이다");
		}
		else if (num==2)
		{
			System.out.println("2");
		}
		else
		{
			System.out.println("그밖에");
		}
		//이렇게 같은 것을 찾는 조건문은 switch로 변경 가능
		//switch문
		switch (num)
		{
		case 0:
			System.out.println("0");
			break;
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
			default:
				System.out.println("그밖에");
		}
		//switch ~ case ~ break
		//퀴즈 : 사용자 정수 입력받기 
		//1 : 안녕하세요 2 : 반갑슴  3: 잘있어요 4: 다시만나요
		int num1 =0;
		System.out.print("입력란 : ");
		Scanner sc = new Scanner(System.in);
		num1= sc.nextInt();
		switch (num1)
		{
		case 1:
			System.out.println("안녕하세요");
			break;
		case 2:
			System.out.println("반갑습니다");
			break;
		case 3:
			System.out.println("잘있어요");
			break;
		case 4:
			System.out.println("다시만나요");
			break;
			default:
				System.out.println("잘못 입력");
		}
	}

}
