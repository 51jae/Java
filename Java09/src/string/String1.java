package string;

public class String1
{
	public static void main(String[] args)
	{
		//string 문자열 ( 자바에서 제공해주는 클래스)
		String str = "hello world!";
		
		//두 문자열이 같은지 비교하는 메서드 equals
		boolean result =str.equals("hello world");
		System.out.println(result);
		
		if(str.equals("hello world"))
		{
			System.out.println("같음"	);
		}
		else 
		{
			System.out.println("다름");
		}
		
		//2. 해당 문자열을 포함하는지 검사 contains
		if(str.contains("hell"))
		{
			//str 안에 hell문자열이 있는지 검사
			System.out.println("갖고있음");
		}
		else 
		{
			System.out.println("없음");
		}
		//3.교체 replace
		String result2 = str.replace("hello", "hi"); // hello을 hi로	
		System.out.println(result2);
		
		//4.글자수 알려주기 length()	
		System.out.println(str.length());
		
		// hi >> ['h','i',0]
		
		//5. 글자의 위치를 알려주기 indexOf()
		int result3 = str.indexOf("world");	//world 의 w 위치를 알려줌 (배열 형대로)
		System.out.println(result3);
		
		//6.위치를 알려주면 해당하는 글자를 알려줌 charAt()
		char result4 =str.charAt(1);	//hello world!
		System.out.println(result4);	//e
		
		//7. 잘라내기 (추출하기) substring
		result2 = str.substring(1,5);	//1~4번방 잘라냄
		System.out.println(result2);
		
		//8 합치기 + 
		str =str + "@@";
		System.out.println(str);
		
		//quiz1 길동만 추출해서 출력
		String src = "홍길동";
		src=src.substring(1,3);// indexOf도 활용해서 가능
		System.out.println(src);
		
		//quiz2 src2 변수에서 홍길동을 장보고로 바꿔서 출력
		String src2 = " 안녕하세요 저는 홍길동입니다. 올해 23 살 입니다.";
		String src3 = src2.replace("홍길동", "장보고");	//replace(sr3.index+
		System.out.println(src3);
		
	}
}
