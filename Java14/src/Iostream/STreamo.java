package Iostream;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class STreamo 
{
	public static void main(String[] args) 
	{
		String filename = "파일경로/파일명 .java";
		Path filepath = Paths.get(filename);
		try {
			String fileContent = Files.readString(filepath);
			System.out.println(fileContent);
		}catch (IOException e)
		{
			System.out.println("파일을 불러오는 중 오류가 발생 : " + e.getMessage());
		}
	}
}
