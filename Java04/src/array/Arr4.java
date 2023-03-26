package array;

import java.util.Scanner;

public class Arr4 {

	public static void main(String[] args)
	{
		//국가와 수도 (5개)
//		대한미국의 수도 서울
//		일본 도쿄
//		중국 베이징
//		미국 워싱턴
//		러시아 모스크바
		String sudo [] = new String [5];
		sudo [0]="서울";
		sudo [1]="도쿄";
		sudo [2]="베이징";
		sudo [3]="워싱턴";
		sudo [4]="모스크바";
		String nara []= {"대한민국","일본","중국","미국","러시아"};
		for(int i=0;i<5;++i)
		{
			System.out.println(nara[i]+" - "+sudo[i]);
		}
		
		//시용자 입력으로 국가를 받아서 
		//해당 국가의 수도를 알려주는 프로그램
		//수도를 알고자하는 국가의 이름을 입력
		
		//같은 문자열을 찾으면 해당 i(방번호)를 백업
		//백업한 방번호를 통해서 수도를출력
		//숫자 비교 str == str2;
		//문자 비교 str1.equals(str2);
		Scanner sc = new Scanner(System.in);
		String input="";
		System.out.println("수도를 알고자 하는 국가의 이름 : ");
		  input =  sc.next();
		  int bk_index =  -1;
		  for(int i=0;i<sudo.length;++i)
		  {
			  if(input.equals(nara[i]))
			  {
				  bk_index = i;
				  break;
			  }
			  
		  }
			  if(bk_index == -1)
			  {
				  System.out.println("해당국가 없음");
			  }
			  else
			  {
				  System.out.println(nara[bk_index]+"의 수도는"+sudo[bk_index]+"입니다.");
			  }
		  
		
		
		
	}
	

}
