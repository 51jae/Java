package cls;

public class Method2 
{
	public static void main(String[] args)
	{
		//객체화 
		MyClass5 mc5 = new MyClass5();
		//입력값x,반환값x
		mc5.메서드1();
		mc5.메서드1();
		System.out.println("끼어들기");
		mc5.메서드1();
		
		//입력값o,반환값x
		mc5.메서드2("안녕","감사해요");
		mc5.메서드2("잘있어요","다시만나요");
		//반환값이 있으면 변수를 형댜로 사용
		//메서드3이 String으로 번환햐쥬가 땨뮨'
		String result3= mc5.메서드3();
		result3 = mc5.메서드3();
		System.out.println(result3);
		
		//입력값 o,반환값o
		//()안은 채워야하고 ,반환값을 변수를 만듬
		//메서드4는 int 형태로 반환 입력값은 실수 1개
		int result4= mc5.메서드4(3.7);	//4
		System.out.println(result4);
		
		result4= mc5.메서드4(3.3);
		System.out.println("결과는 :"+result4);
		
		System.out.println("결과는 : "+mc5.메서드4(5.5));	//변수처럼 사용
	}
}

class MyClass5
{
	//메서드1 : 반환값x,입력값x (오로지 코드 저장 , 가독성)
	void 메서드1()
	{
		//입력값이 없으면 ()를 비워놓기
		//반환값이 없으면 자료형은 void 로 하고 return은 생략
		//return;
		
		//오로지 코드 재사용
		int num=1;
		System.out.println("나는 메서드" + num+"에 저장된 코드다");
	}
	
	//메서드2 : 반환값x , 입력값 o (코드 재활용, 일부만 변수인 경우)
	void 메서드2(String str1,String str2)
	{
		//입력값이 있으면 입력받고자 하는 값의 변수들을 생성해 놓는다
		//반환값이 없으면 자료형은 void,return은 생략
		//코드 재활용(입력되는 값만 변경하면서 재활용)
		
		System.out.println("소괄호로 넘어오는 값만 변경"+str1+str2);
		System.out.println("코드 재활용"+str2);
	}
	
	//메서드3 : 반환값o, 입력값x(코드 재사용, 사용한 후에 마지막으로 전달해줄 값이 있음)
	
	String 메서드3()
	{
		//메서드의 자료형은 return값의 자료형을 적어준다
		String result = "반값습니다";
		System.out.println("메서드 3을 사용");
		
		return result;		//코드 마지막에 return 옆에 있는 값을 전달
	}
	
	//메서드 4 : 반환값 o, 입력값 o
	int 메서드4(double dnum)
	{
		//입력값이 있으면 ()를 변수로 채워놓고 
		//반환값이 있으면 return 을 사용하고 맨앞의 자료형을 맞춰준다
		System.out.println("실수 자료형을 반올림합니다.");
		double result = dnum - (int)dnum;	//소수점 부분만
		if(result >= 0.5)
		{
			dnum +=1.0;		//만약 소수점 부분이 0.5보다 크면 +1
		}
		return (int)dnum;		//소수점 부분 날림
	}
	
	
	
	
}
