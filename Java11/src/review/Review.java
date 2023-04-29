package review;

public class Review 
{
	public static void main(String[] args) 
	{
		//클래스를 사용하기 위해서 객체화를 해야함
		//클래스명 객체명 new 클래스명();
		myclass2 mc2 = new myclass2();
		myclass2 m2 = new myclass2(); //mc2와 m2 는 다른 존재 (싱글턴패턴이 아니면 서로 다른 존재)
		mc2.setNum(33);
		
		//return값은 변수르 받는다
		int num = mc2.getNum();
		if(num>0)
		{
			System.out.println("양수"+num);
		}
		else
		{
			System.out.println("음수"+num);
		}

	}
}
class myclass2 extends myclass
{
	//extends (상속) : myclass를 myclass2에 복붙
}
class myclass
{
	//변수 = 멤버변수
	private int num;	
	private String str;
	private double dnum;
	private int numbers[] = new int[30];	//정수 공간 30게 묶어놓음	0~29
	//함수 = 메서드
	void setNum(int num)  //(): 사용할 때 정해질 값을 담을 변수 (매개변수)
	{
		this.num=num;	//멤버변수 num에다가 매개변수 num의 값을 대입		
	
		String str = "" ; //지역변수 (함수가 끝나면 사라짐)
	}
	int getNum()
	{
		
		return num; //return은 함수 실행 후 사용한 곳에 알려줄 값(함수 자료형을 결정)
	}
	//생성자(이름이 클래스명과 같은 메서드,객체화할 때 사용됨)
	myclass()
	{
		num=0;
		str = null;
		dnum=0.0;
		for(int i=0;i<numbers.length;i++)
		{
			numbers[i]=0;	//0~29번방을 모두 0으로 대입
		}
	}
}
