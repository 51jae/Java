package except;

import java.util.Scanner;

public class Try3
{
	public static void main(String[] args) 
	{
		//Scanner 로 nextLine으로 숫자를 입력받아서 int 로 형변환
		//예외처리까지 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력");
		int a=0;
		try {
			a = Integer.parseInt(sc.nextLine());	//어떤 애들 try 해야하나요?자바에서 안내
			
		}
		catch(Exception e)
		{
			System.out.println("입력:"); //어떤 입력값에더 무사히 도달할 수 있게끔
		}
		System.out.println(a);
		
		System.out.println("종료");
		
	}
}
