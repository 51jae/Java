package extend;

public class Ex5 
{
	public static void main(String[] args)
	{
		MyStrDeco mse = new MyStrDeco("hello");
		mse.printStr();
		
	}
}
class MyStr
{
	//멤버
	protected String str;

	//생성자
	public MyStr(String str)
	{
		this.str=str;
	}
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	public void printStr()	
	{
		System.out.println(str);
	}
}
class MyStrDeco extends MyStr
{

	public MyStrDeco(String str) {
		super(str);
	}
	public void 데코 ()
	{
		System.out.println("=="+str+"==");
	}
}
