package extend;

public class Ex2
{
	public static void main(String[] args)
	{
		//상속: 내눈에는 안보이지만 컴퓨터가 클래스를 복사붙여넣기를 하게 한다
		//상속 : 물려주다(어떤 클래스에 있는 변수와 메서드를 다른 클래스에 물려준다
		//extends
		
		Person p1 = new Person();
		p1.정보입력("홍길동", 16,false);
		p1.정보보기();
		//기존클래스(Person)를 복붙해서 새로운 클래스를(Member) 만들고 약간의 수정을 거치고 싶다.(상속)
		Member m1 = new Member();	//상속을 하는 이유 : 기존 클래스에서 일부만 수정 하려고
		m1.정보입력("유관순",19,true);
		m1.정보보기();
	}
}
//사람 클래스
class Person
{
	//private : 자신 클래스 말고는 다 사용 불가능
	//private->protected : 상속에 한새서는 사용을 허용
	protected String name;
	private int age;
	private boolean gender; //성별추가
	
	public void 정보입력(String name, int age,boolean gender)
	{
		this.name=name;
		this.age=age;
		this.gender = gender;
	}
	public void 정보보기()
	{
		System.out.print("이름"+name+",나이 : "+age+",성별:");
		if(gender == false)
		{
			System.out.println("남");
		}
		else
		{
			System.out.println("여");
		}
	}
}

//멤버 클래스(사람에게 있는 변수와 메서드를 회원에게 물려주자)
class Member extends Person
{
	//사람 클래스를 복사해서 회원 클래스에 붙여넣어라
	

	//extends 상속을 하는 이유 수정 or 추가
	//삭제는 필요x 안쓰면 그만 
	
	//상속받은 후 추가하는 방법 
	private String 그룹명="우리그룹";
	
	public void 회원정보() 
	{
		System.out.println(그룹명+"의 회원인 "+name+"입니다.");
	}
	//상속받은 후 수정 방법: 오버라이딩(물려받은 메서드를 재정의(다시만듬))
	public void 정보보기()
	{
		super.정보보기(); //super. :  상속해준 클래스의 정보보기를 사용
		//this. : 나ㅣ , super. : 부모
		System.out.println("회원그룹은 "+그룹명);
		
		//오버라이딩(수정) : 부모의 것과 나의 것이 곂치면 나의 것이 우선순위가 더 높다
	}
}












