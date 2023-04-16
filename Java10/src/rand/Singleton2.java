package rand;

public class Singleton2 
{
	private Singleton2() {}
	private static Singleton2 instance;
	
	public static Singleton2 getInstance() {
		if(instance == null)
		{
			instance = new Singleton2();
		}
		return instance;
	}
	private String str;
	public String getstr() {return str;}
	public void setStr(String str) {this.str = str;}
	
}
