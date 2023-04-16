package time;

public class Staticvar
{
	//이렇게 하면 ㄴㄴ 싱글턴 ㄱ
	static String str1 = "안녕하세여";
	static String str2 = "반갑습니다.";
	static int num1 = 314;
	static int nums[] = new int[100];	//성능이 매우 느려짐
	public static void main(String[] args) {
		Test.print();
		Singleton singleton = Singleton.getSInstance();	//static메서드
		singleton.setStr("안녕하세요 싱글턴입니다.");
		System.out.println(singleton.getstr());
	}
	
	
}

class Test
{
	public static void print()
	{
		System.out.println(Staticvar.str1);
		Staticvar.nums[0]=0;
		Staticvar.nums[1]=1;
		Staticvar.nums[2]=2;
		
	
		System.out.println(Staticvar.num1);}
}

