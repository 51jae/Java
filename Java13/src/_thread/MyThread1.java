package _thread;

import java.util.Scanner;

public class MyThread1 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//쓰레드	동시작업 가능(main 1쓰레드)
		
		//10초동안 배경음 + 채팅 + 출력
		for(int i = 0; i<10; i++)
		{
			System.out.println("배경음 : ");	//배경 재생하면서
			System.out.println("채팅입력 : ");	//채팅도 입력하면서
			String str = sc.nextLine();
			System.out.println(str);
			System.out.println("상대방 채팅 : ");	//상대방이 입력하는 채팅도 보여야함
		}
		System.out.println("결론 : main쓰레드(주쓰레드) 하나만으로는 동시 작업이 불가능");
		
		//쓰레드 추가 생성 필요
	}

}
