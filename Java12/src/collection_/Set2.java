package collection_;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Set2 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String nation ="";
		String after ="";
		NationSet ns = new NationSet();
		while(true)
		{
			System.out.println("==국가 이름 저장 프로그램");
			System.out.println("1추가 2조회 3변경 4삭제0끝내기");
			choice = Integer.parseInt(sc.nextLine());
			if(choice == 1)
			{
				System.out.println("추가할 국가명 입력 : ");
				nation = sc.nextLine();
				ns.addNation(nation);
			}
			else if(choice ==2)
			{
				ns.showAll();
			}
			else if(choice == 0)
			{
				System.out.println("프로그램 종료");
				sc.close();
				break;
			}
			else if(choice == 3)
			{
				//변경
				System.out.println("변경할 국가명");
				nation = sc.nextLine();
				System.out.println("변경될 국가명");
				after = sc.nextLine();
				ns.setnation(nation,after);
			}
			else if (choice ==4)
			{
				//삭제
				System.out.println("삭제할 국가 : ");
				nation =sc.nextLine();
				ns.deletenation(nation);
			}
			
		}
	}
}
//국가 이름을 보관하는 프로그램, 중복값이 없어야함
class NationSet
{

	//멤버변수 private
	private HashSet<String> hs = new HashSet<>();
 
	//메서드 public
	
	public void addNation(String nation)
	{
		hs.add(nation);
	}
	

	public void deletenation(String nation) 
	{
		//삭제할 국가
		hs.remove(nation);
	}


	public void setnation(String nation, String after)
	{
		//변경할 국가
		hs.remove(nation);
		hs.add(after);
	}


	public void showAll() 
	{
		for(String e : hs)
		{
			System.out.println(e);
		}
	}
}
