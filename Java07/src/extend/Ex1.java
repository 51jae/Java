package extend;

public class Ex1
{
	public static void main(String[] args)
	{
		Human 홍씨 = new Human("홍길동",16);
		홍씨.말하기();
		홍씨.걷기();
		홍씨.밥먹기();
		
		HumanEx 박씨 = new HumanEx("박첨지",18,true);
		박씨.말하기();
		
		HumanDeco 이씨 = new HumanDeco("이이",22,true);
		이씨.나이정보();
		//원본에 버그가 발생해서 수정해야 하면
				//실수학 확률 높아짐
	}
}


//사람(human) 클래스
class Human
{
	//name  , age
	private String name;
	private int age;
	private boolean gender;
	//생성자 정보 넣기
	Human(String name, int age)
	{
		System.out.println("생성!");
		this.age = age;
		this.name = name;
		this.gender=gender;
	}
	//말하기 , 걷기 , 밥먹기
	public void 말하기()
	{
		System.out.println(name+"이가 말합니다."+gender);
	}
	
	public void 걷기 ()
	{
		System.out.println(name+"가 걷습니다."+gender);
	}
	
	public void 밥먹기()
	{
		System.out.println(name+"가 밥먹습니다."+gender);
	}
}
class HumanEx
{
	//name  , age
	private String name;
	private int age;
	private boolean gender; //성별 남:false 여 true
	//생성자 정보 넣기
	HumanEx(String name, int age, boolean gender)
	{
		System.out.println("생성!");
		this.age = age;
		this.name = name;
		this.gender=gender;
	}
	//말하기 , 걷기 , 밥먹기
	public void 말하기()
	{
		System.out.println(name+"("+age+")이가 말합니다."+gender);
	}
	
	public void 걷기 ()
	{
		System.out.println(name+"("+age+")가 걷습니다."+gender);
	}
	
	public void 밥먹기()
	{
		System.out.println(name+"("+age+")가 밥먹습니다."+gender);
	}
}
class HumanDeco
{
	//name  , age
	private String name;
	private int age;
	private boolean gender;
	//생성자 정보 넣기
	HumanDeco(String name, int age,boolean gender)
	{
		System.out.println("생성!");
		this.age = age;
		this.name = name;
		this.gender=gender;
	}
	public HumanDeco(String string, int i) {
		// TODO Auto-generated constructor stub
	}
	//말하기 , 걷기 , 밥먹기
	public void 말하기()
	{
		System.out.println("=="+name+"이가 말합니다."+gender);
	}
	
	public void 걷기 ()
	{
		System.out.println("=="+name+"가 걷습니다."+gender);
	}
	
	public void 밥먹기()
	{
		System.out.println("=="+name+"가 밥먹습니다."+gender);
	}
	public void 나이정보()
	{
		System.out.println("=="+name+"의 나이는 "+age+"살입니다."+gender);
	}
}


