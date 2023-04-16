package time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyDateTime
{
	String str1="멤버변수";		//객체화없이는 사용 불가능
	static String str2 = "static정적 멤버변수";	//객체화 안하고 사용가능(변수 생성시점 이후에만)
	public static void main(String[] args) 
	{
		MyTime mt =  new MyTime();
		System.out.println(mt.dateTime());
		System.out.println(mt.date());
		System.out.println(mt.time());
		System.out.println(mt.tomorrow());
		System.out.println(mt.after30());
		
//		System.out.println(MyDateTime.str1);
//		System.out.println(str1);
		System.out.println(MyDateTime.str2);
		//static 으로 올려놓으면 객체화없이 그 안에 있는 메서드와 멤버변수를 바로 사용 가능
		GetInstance get = GetInstance.getInstance(); //GetInstance : static으로 올려놔서 접근이 가능
		GetInstance get2 = GetInstance.getInstance();	//get==get2
		
		//getInstance() : static으로 객체화
		get.print();
		
		//정석적인 객체화
//		Singleton 홍길동 = new Singleton();
//		Singleton 이순신 = new Singleton();
		
		//싱글패턴의 객체화 이순신 == 홍길동
		Singleton 홍길동 = Singleton.getSInstance();
		Singleton 이순신 = Singleton.getSInstance();
		홍길동.setStr("홍길동 입니다.");
		System.out.println(이순신.getstr());
		
		//getInstance ():객체화작업
	}
}
//클래스
class MyTime
{
	//자바 코드로 현재 시간을 가져오는 법
	
	//caledar,date,simpledateformat,string
	
	//멤버변수
	private String str;
	
	//메서드
	public String dateTime()
	{
		//현재 시간을 반환
		Calendar cal = Calendar.getInstance(); //객체화(싱근턴패턴,1회용객체화)
		Date date = cal.getTime();		//시간을 가져옴
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초"); //시간을 출력할 형태를 생성자로 결정
		str = sdf.format(date);
		return str;
	}
	public String date()
	{
		//년 월 일 반환
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		str = sdf.format(date);
		return str;
	}
	
	public String time()
	{
		//10-00-55
		Calendar cal = Calendar.getInstance(); //객체화(싱근턴패턴,1회용객체화)
		Date date = cal.getTime();		//시간을 가져옴
		SimpleDateFormat sdf = new SimpleDateFormat("HH-mm-ss"); //시간을 출력할 형태를 생성자로 결정
		str = sdf.format(date);
		return str;
		
	}
	public String tomorrow()
	{
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd");
		SimpleDateFormat sdf4 = new SimpleDateFormat("HH");
		SimpleDateFormat sdf5 = new SimpleDateFormat("mm");
		SimpleDateFormat sdf6 = new SimpleDateFormat("ss");
		
		String year = sdf1.format(date);
		String month = sdf2.format(date);
		String day = sdf3.format(date);
		String hour = sdf4.format(date);
		String minute = sdf5.format(date);
		String second = sdf6.format(date);
		
		//년-월-일 시:분:초
		str = year + "년-" + month + "월-" + (Integer.parseInt(day)+1) +"일" + 
		(Integer.parseInt(hour)+1) + "시:" + minute + "분:" + second + "초";
		
		return str;
	}
	public String after30()
	{
		Calendar cal = Calendar.getInstance();	//싱글턴패턴 객체화(이때시간을 가져옴)
		cal.add(Calendar.MINUTE, 30);	//분(30분후
		cal.add(Calendar.DATE, -1);		//일(하루전
		
		Date date = cal.getTime();	//date 형변환
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd");
		SimpleDateFormat sdf_1 = new SimpleDateFormat("HH");
		SimpleDateFormat sdf_2 = new SimpleDateFormat("mm");
		SimpleDateFormat sdf_3 = new SimpleDateFormat("ss");
		
		String year = sdf1.format(date);
		String month = sdf2.format(date);
		String day = sdf3.format(date);
		String hour = sdf_1.format(date);
		String minute = sdf_2.format(date);
		String second = sdf_3.format(date);
		
		str = year + "년-" + month + "월-" + day +"일" + 
			hour + "시:" + minute + "분:" + second + "초";
		return str;
	}
}