package time;

public class Singleton 
{
	//디자인 패턴을 싱글 패턴으로 해서 클래스 구성 (디자인)
private Singleton() {}
	
	private static Singleton instance;			// 객체를 저장할 멤버변수 ㄱㅊㅎ
	
	// 객체 멤버변수를 반환해줄 static 메서드 : getInstance()
	public static Singleton getSInstance() {		// 얘를 통해 객체화
		if(instance == null) {
			instance = new Singleton();			// getInstance() 메서드를 사용하면 내부에서 객체화
		}
		return instance;
	}
	//멤버변수 메서드
	private String str;
	public String getstr() {return str;}
	public void setStr(String str) {this.str = str;}
	
	
}
