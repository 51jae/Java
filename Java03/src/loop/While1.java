package loop;

public class While1 {

	public static void main(String[] args) 
	{
		//제어문 : 프로그램의 실행흐름을 변경하는 문법 (기본 위 아래 왼 오)
		//조건문 : if , switch
		//반복문 : while, for
		
		//while(){} 
		//while : if문과 유사 한가지 차이점 존재
		//if(){} : ()의 조건이 맞으면 {} 실행
		//while(){} :()의 조건이 맞음녀 {}실행 다시 () 조건을 검사하러 올라감
		if(true)
		{
			System.out.println("if문 실행");
		}
		while(true)
		{
			System.out.println("while문 실행");
		}
	}

}
