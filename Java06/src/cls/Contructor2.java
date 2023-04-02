package cls;

public class Contructor2
{
	public static void main(String[] args) {
		Person 사람 = new Person("홍길동", 30);
		
		PersonView pv = new PersonView();
		PersonView pv2 = new PersonView(사람);
		pv.infor(사람);	//들어온값을 저장하고 출력
		pv2.infor();	//바로 출력
	}
}
class Person {
	//멤버변수 : 이름 나이
	private String name;
	private  int age;
	

	//생성자 (생성자 통해서 멤버변수 초기화 )
	public  Person (String name , int age)
	{
		this.name = name;
		this.age = age;
	}
	
	//게터세터
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

class PersonView{
	private Person person;
	//기본 생성자
	//PersinView a = new PersonView();
	public PersonView() {}	//여러 형태의 생성자(객체화)를 허용해주고
	//생성자 오버로딩 : 받아온 객체를 멤버변수에 백업
	//PersinView a = new PersonView();
	public PersonView(Person person) {
		this.person = person;
	}
	
	//메서드 (출력용)
	public void infor() {
		System.out.println("이름 : "+person.getName()+",나이 : "+person.getAge());
	}
	//오버로딩
	public void infor(Person person) {
		this.person = person;
		System.out.println("이름 : "+person.getName()+",나이 : "+person.getAge());
	}
}