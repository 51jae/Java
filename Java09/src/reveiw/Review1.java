package reveiw;

public class Review1
{
	public static void main(String[] args)
	{
		//다른 클래스의 내용을 사용하기 위해선 객체화 라는 작업이 필요함
		//객체를 동해 사용
		//클래스명 객체명 = new 생성자명();
		Myclass1 mc = new Myclass1();	//객체화
		
		mc.myMethod();
		MyClass2 mc2 = new MyClass2();
		mc2.myMethod();
		MyClass3 mc3 = new MyClass3();
		//System.out.println(mc3.num2/mc3.num); 터짐
		
	}
}

class Myclass1
{
	//변수와 자료형
	String str;	//변수선언
	int num = 0;	//변수 초기화 , 대입
	double dnum;
	//멤버변수는 private  메서드는 public(캡슐화,정보은닉)
	private boolean bool;	//클래스 멤버변수
	
	//메서드(){}
	int myMethod()
	{
		//변수 대입
		this.str = "hello";	//멤버변수
		String str = "world";	//지역변수
		
		//연산자 + - * / % > < >= <= == != || && ! | & ~ ...
		this.str =  this.str + str;
		System.out.println(this.str);
		
		for(int i = 0; i<3; i++)
		{
			if(this.str !=null || !(this.str.equals("")))
			System.out.println(this.str);
		}
		return 0; 	//리턴은 함수의 자료형과 맞춰야함
	}
}
class MyClass2 extends Myclass1
{
	//MyClass1의 내용이 복붙되어있음
	
	String arr[]= {"일","이","삼","사"};	//배열
	int[] nums = new int[4];

	//수정 (오버리이딩 , 재정의)
	@Override
	int myMethod() 
	{
		System.out.println("오버라이딩");
		
		return 1; 
	}
	public MyClass2()
	{
		System.out.println("MyClass2 객체화 성공");
	}
}
class MyClass3 extends Adapter1
{
	//선언만 된 추상메서드를 오버라이딩해야 오류 없어짐
	//클래스 이름 밑에 빨간줄에 마우스를 

	@Override
	public void must2() {
		System.out.println("머스트2");
	}

	@Override
	public void must4() {
		System.out.println("머스트4");
	}

	@Override
	public void must3() {
		System.out.println("머스트3");
	}
	
}









