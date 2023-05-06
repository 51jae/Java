package multiThreading;

import java.util.Scanner;

public class MyThread5 {

	public static void main(String[] args)
	{
		MyModel mm = new MyModel();
		SaveList s1 = new SaveList(mm);
		PrintList p1 = new PrintList(mm);
		mm.list.add("sample0");
		//만약에 하나의 쓰레드가 완료 될때까지 다른 쓰레드가 대기하고 싶으면 
		//join()메서드 사용
		//하나의 쓰레드에서는 list에 값 저장을 
		s1.start();
		//s1쓰레드가 수행되기 전까지 다른 쓰레드는 대기 join
		try 
		{
			s1.join();	//s1쓰레드가 끝나기 전까지 다른 쓰레드 대기
		} catch (InterruptedException e)
		{
		}
		//다른 하나의 쓰레드에서는 전체 출력
		p1.start();
	}

}
class SaveList extends Thread
{
	private MyModel mm;
	
	public SaveList(MyModel mymodel)
	{
		mm = mymodel;
	}	//생성자()
	@Override
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		String str = "";
		while(true) {
			if(str.equals("0"))
			{
				break;
			}
			System.out.println("저장할 항목을 입력 (0을 입력하면 종료) : ");
			str = sc.nextLine();
			mm.list.add(str);	//ArrayList에 추가
		}
		sc.close();
	}	//run()
}		//SaveList()
class PrintList extends Thread
{
	private MyModel mm;
	
	public PrintList(MyModel mm)
	{
		this.mm = mm;
	}	//Constructor()
	@Override
	public void run() 
	{
		for(String str : mm.list)
		{
			System.out.print(str+" ");
		}
	}
}
