package database_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection1
{
		public static void main(String[] args) {
//	        try {
//	        	Class.forName("org.mariadb.jdbc.Driver");
//	        	System.out.println("라이브러리 로드 성공!");
//	        } catch (ClassNotFoundException e) {
//	            e.printStackTrace();
//	        }
//	        try {
//				Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/company","root","root");
//			System.out.println("연결 성공");
//	        } catch (SQLException e) {
//				e.printStackTrace();
//				System.out.println("연결 실패");
//			}
	        SQLConnector sql = new SQLConnector();
	        
	    }
}

//연결테스트
class SQLConnector
{
	private Connection conn;
	private static final String DBID = "root";
	private static final String DBPW = "root";
	private static final String DBURL = "jdbc:mariadb://localhost:3307/company";
	
	//생성자
	public SQLConnector()
	{
		try {
		System.out.println("생성자 사용");
		Class.forName("org.mariadb.jdbc.Driver");
		conn = DriverManager.getConnection(DBURL,DBID,DBPW);
		System.out.println("마리아DB 드라이버 로딩 성공");
		}catch(Exception e)
		{
			System.out.println("마리아DB 드라이버 로딩 실패");
			e.printStackTrace();
		}
	}
}

	