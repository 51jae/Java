package loop;

import java.util.Scanner;

public class Fro2 {

	public static void main(String[] args) 
	{
		//for문을 통해 구현	
		int sum = 0;
		//1. 안녕 5번
		for(int i =0; i<=5;i++)
		{
			System.out.println("안녕");
		}
		//2. 1~10까지 합계	
		for(int j=1;j<=10;j++)
		{
	
			sum+=j;
		}
		System.out.println("1부터 10까지 의 합계 "+sum);
		
		//3. 1~입력값까지 합계 구하기
		Scanner sc = new Scanner(System.in);
		int l =0;	//값을 사용자에게 받을 공간
		int sum1 = 0;	//값을 더 한 공간
		int k =1;	//값이 1
		System.out.println("입력값 입력 : ");
		l=sc.nextInt();
		for(k=1;k<=l;k++)
		{
			sum1+=k;	
		}
		System.out.println("1부터"+l+"더한값"+sum1);
	}

}
