package cls;

public class Class4
{
	public static void main(String[] args) 
	{
		MyClass8 mc8=new MyClass8();
		mc8.setStr("담기");
		mc8.getStr();
	}
}

class MyClass8
{
	//클래스 : 변수와 함수를 묶어 놓은것
	//변수 ==> 멤버변수
	//함수 ==> 메서드
	
	String str; //클래스에 있는 변수는 '클래스 멤버변수' 라고 한다.
	
	void func(MyClass8 this)	{}//클레스에 있는 함수는 '메서드'라고 한다.//()없어도됌
	
		//클래스의 기원 :초보자를 위해서 (초보자에게 코드를 교육하지 않고 사용하게 하기 위해서) 
		void setStr(String a_str)
		{
			//str 변수에 값을 담는 함수

			//멤버변수 쓸경우 this 쓰기 
			this.str=str;
		}
		String getStr(MyClass8 this)
		{
			//str 변수를 사용하는 함수
			String str="hello";
			System.out.println(str);  	//함수안에 있는 변수 
			
			return this.str;	//멤버변수 사용하고 싶다. this.str
		}
	
}