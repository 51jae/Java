package extend;

public class Ex4 
{
	public static void main(String[] args) {
		스타벅스 cafe1 = new 스타벅스("본점",123);
		cafe1.printMenu();
		부평 cafe2 = new 부평("부평",456);
		cafe2.printMenu();
		강남 cafe3 = new 강남("강남",789);
		cafe3.printMenu2();
	}
}
//스타벅스 
class 스타벅스
{
	protected String 지점명;
	protected String 메뉴[]= new String[3];
	protected int  매출;
		
	public 스타벅스(String 지점명, int 매출)
	{
		this.지점명=지점명;
		this.매출=매출;
		setMenu();
	}

	private void setMenu() {
		메뉴[0]="카푸치노";
		메뉴[1]="카페라떼";
		메뉴[2]="오렌지 주스";
		
	}
	public void printMenu()
	{
		System.out.println(지점명+"의 메뉴판 : ");
		for(int i =0;i<메뉴.length;i++)	
		{
			System.out.println(메뉴[i]+" ");
		}
		System.out.println();
	}
}
//스타벅스_부평
class 부평 extends 스타벅스
{

	public 부평(String 지점명, int 매출) {
		super(지점명, 매출);
		setMenu();
	}
		//오버라이딩 : 상속받은 메서드를 재정의(수정)
	public void setMenu() {
			메뉴[0]="딸기";
			메뉴[1]="아아";
			메뉴[2]="유자 주스";
		}
		//오버로딩 : 메서드명이 같아도 매개변수가 다르면 다른 메서드로 인식
		public void setMenu(String menu1,String menu2, String menu3)
		{
			메뉴[0]=menu1;
			메뉴[1]=menu2;
			메뉴[2]=menu3;
		}
	
	
}
//스타벅스_강남
class 강남 extends 스타벅스
{

	public 강남(String 지점명, int 매출) {
		super(지점명, 매출);
		setMenu();
	}
	private void setMenu() {
		메뉴[0]="자몽";
		메뉴[1]="아이소";
		메뉴[2]="수박 주스";
	}
	public void printMenu2()
	{
		System.out.println(지점명+"의 메뉴판 : ");
		for(int i =0;i<메뉴.length;i++)	
		{
			System.out.println(메뉴[i]+" ");
		}
		System.out.println();
	}
	
}












