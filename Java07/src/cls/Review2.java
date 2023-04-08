package cls;

public class Review2 
{
	public static void main(String[] args) 
	{
			사칙연산 n1 = new 사칙연산(3,4);
			사칙연산 n2 = new 사칙연산(5,5);
			
			n1.add();
			n2.add();
	}
}
class 사칙연산
{
	private int num1;
	private int num2;

	
	
	사칙연산(int num1,int num2)
	{
	this.num1 = num1;
	this.num2 = num2;
	}
	public int add()
	{
		System.out.println("결과 : "+(num1+num2));
		return num1+num2;
	}
	public int  sub()
	{
		System.out.println("결과 : "+(num1-num2));
		return num1-num2;
	}
	public int mul()
	{
		System.out.println("결과 : "+(num1*num2));
		return num1*num2;
	}
	public int div()
	{
		System.out.println("결과 : "+(double)(num1/num2));
		return num1/num2;
	}
	
}
