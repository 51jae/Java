package operator;

public class Plus1
{
	public static void main(String[] args) 
	{
		//연산자(연산기호)	:	특정한 기능을 제공 기호
		// + , - , * , / , % ,= ,< ,> ,== , !=,...
		
		//문자열 합치기 (+)
		// "hello" + "world"; 	//hello world
		String 글자1= "hello";
		String 글자2 = "world";
		String 글자3= 글자1+글자2;
		
		System.out.println(글자3);
		System.out.println("hello"+"world");
		System.out.println(글자1+글자2	);
		
		//문자열과 문자열을 더하면 문자열을 하나로 합쳐준다
	}
}
