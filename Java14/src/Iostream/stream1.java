package Iostream;

import java.io.File;

public class stream1 {

	public static void main(String[] args) 
	{
		//Stream(강) :대량의 데이터를 주고받는 행위
		FileFound ff = new FileFound();
		ff.go("c://");
		//문자열 안에서 역슬래시(\)를 사용하기 위해서 \\로 입력
		//문자열 안에서 쌍따옴표 (") 를 사용하기 위해서 \로 입력
	}

}
class FileFound
{
	public void go(String path)	
	{
		System.out.println(path + "안에 있는 파일을 검색");
		
		//File 클래스 이용
		File file = new File(path);	//해당 경로 안에 모든 파일명이 배열 형태로 저장
		for(String name : file.list())
		{
			System.out.println("파일 : "+name);
		}
	}
}
