package review;

import java.util.Scanner;

public class if4 
{
	public static void main(String[] args)
	{
		//사용자에게 정수를 입력 받고
		//천의 자리로 ,를 넣기	
		
		/*
		 * 100 =>100
		 * 1000=>1,000
		 * 1000000=>1,000,000
		 */
		// 금액을 입력 받고 형변환 
		String str = "";
		int num=0;
		double dnum = 0.0;
		dnum=(double)num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		str = Integer.toString(num);	//int > string
		num = Integer.parseInt(str);	// string -> int 
		int money = 0;
		int 천 = 0;
		int 천나머지 = (Integer) null;
		String str_n = null;
		System.out.println("금액 입력  : ");
		if(money <= 999)
		{
			System.out.println(money);
		}
		else if (money <= 9999)
		{
			천 = money/1000;
			천나머지 = money%1000;
			if(천나머지 < 10)
			{
				str_n = "00"+천나머지;
			}
			else if(천나머지 < 100)
			{
				str_n="0"+천나머지;
			}
			else if(천나머지 < 1000)
			{
				str_n = ""+천나머지;
			}
			System.out.println(천+","+str_n);
		}
		
	}

}
