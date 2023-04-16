package rand;

import java.util.Random;
import java.util.Scanner;

public class Random1	
{
	public static void main(String[] args)
	{
		//자바에서 랜덤을 사용하는 법
		//math 클래스 또는 random  클래스 사용
		MyRandom md = new MyRandom();
		md.go1();
		md.go2();
		md.go3();
		md.go4();
		MyRand mr = MyRand.getInstance();
		System.out.println(mr.go4());
		
		
	}
}
class MyRandom
{	//nextInt () : 0~0.99999999999까지 랜덤
	
	public void go1()
	{
		//0~9랜덤
		Random random = new Random();
		int result = random.nextInt(10); 	//0~9까지 랜덤 (0*10~0.9999*10)
		System.out.println(result);
	}
	public void go2()
	{
		//100~105 랜덤
		Random random = new Random();
		int result = random.nextInt(6) + 100; //0~ 0.9999*6
		System.out.println(result); 
	}
	public void go3()
	{
		Random random = new Random();
		int result = random.nextInt(10)+1;
		System.out.println(result);
	}
	//math 클래스를 사용해서 랜덤
	public void go4()
	{
		int result = (int)(Math.random()*10)+1;
		System.out.println(result);
	}
	
}
class MyRand
{
	
	//생성자 막고
	private MyRand() {}
	
	//객체
	private static MyRand instance;
	//객체화를 진행할 메서드
	public static MyRand getInstance() {
		if(instance == null)
		{
			instance = new MyRand();
		}
		return instance;
	}
	//멤버변수 , 메서드
		public int go4()
		{
			
			//숫자 2개 입력 
			Scanner sc =new Scanner(System.in);
			System.out.println("1번째 숫자입력 : ");
			int a = sc.nextInt();
			System.out.println("2번째 숫자입력 : ");
			int b = sc.nextInt();
			int c=0;
			//첫번째 숫자가 더 크면 교체 
		if(a>b)
		{
			c=a;
			a=b;
			b=c;
		}
			//랜덤돌리기
			Random random = new Random();
			int result = random.nextInt(b-a+1)+a;	//100~105	
			sc.close();
			return result;
		}
}



