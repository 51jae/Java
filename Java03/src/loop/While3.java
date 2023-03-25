package loop;

import java.util.Scanner;

public class While3 
{
	public static void main(String[] args)
	{
		//while문의 플레그를 활용
		//1~10의 합계
		int i=0;
		int sum=0;
		while(i<=10)
		{
			sum+=i;
			i++;
		}
		System.out.println("합계 : "+sum);
		
		//사용자에게 정수 값을 입력 받아서
		//1~n까지 모두 합한 결과
		Scanner sc = new Scanner(System.in);
		System.out.println("입력  : ");
		int sum1 =0;
		int i1=1;
		int num=0;
		num=sc.nextInt();
		while(i1<=num)
		{
			sum1+=i1;
			i1++;
		}
		System.out.println("1부터"+num+"더한값"+sum1);
		
	}
}
