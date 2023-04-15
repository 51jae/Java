package reveiw;

public abstract class Adapter1 implements interface1
{
	//추상클래스 : 인터페이스어ㅏ 클래스의 반반 ( 인터페이스 처럼 사용해도 되고, 클래스처럼 사용해도됨)
	//어댑터(인터페이스를 상속받아서 일부만 구현해서 다른 클라스 처럼 사용)
	public void must1()
	{
		System.out.println("어뎁터에서 미리 구형해서 재용");
	}
	
	//must2 는 구현을 하지 않았기 떄문에 
	//상속받는 곳에서 구현해야함
	
	//인터페이스 처럼 추상 메서드 제공 가능(메서드 선언만)
	public abstract void must3();
	
	//클레스 처럼 구현도 가능
	public String have()
	{
		return "hello";
	}
}
