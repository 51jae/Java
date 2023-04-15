package except;

import java.util.Scanner;

public class Try2
{
	public static void main(String[] args) 
	{
		//try catch 를 써서 나누기 해보기
		Scanner sc = new Scanner (System.in);
		int num1 = 10;
		int num2 = 0;
		int num = 0;
		
		try {
		System.out.println(num1/num2);
		System.out.println(num);
	}
		catch(Exception e)
		{
			System.out.println(" 0 은 불가");
		}
//		System.out.println("숫자 입력");
//		int a =0;
//			
//		 try
//		 {
//			 a=sc.nextInt(a);//nextInt : 숫자만 입력해야함
//		 }
//		 catch(Exception e)
//		 {
//			 System.out.println("숫자 입력");
//		 }
		//형변환 String -> int
		 int c=0;
		 String str="글자";
		 try {
			 c= Integer.parseInt(str);
			 System.out.println(c);
		 }
		 catch(Exception e)
		 {
			 System.out.println("숫자만 가능"+e);
		 }
		
	}
	
}
