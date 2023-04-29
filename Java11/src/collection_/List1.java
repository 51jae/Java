package collection_;

import java.util.ArrayList;

public class List1
{
	public static void main(String[] args)
	{
		//자바에서는 최상단 클래스인 object가 있다
		//모든 자바에서 제공해준느 클래스는 object 클래스를 상속받는다
		//그중 List라는 클래스가 있다(배열의 어려운점을 자동화 해주는 클래스다)
		//List를 상속해서 arraylist라는 클래스를 자바에서 제공해주고 arraylist로 주로 사용됨
		
		//ArrayList는 다른 패키지에 있기 때문에 util.ArrayList를 import
		ArrayList<String> arr1 = new ArrayList<>(); 	//String배열
		ArrayList<Integer> arr2 = new ArrayList<>();  //int배열	//Integer == java한계
		ArrayList<Double> arr3 = new ArrayList<>();		//double배열 (가변 배열)
		
		String str[]=new String[10];
		int num[]=new int [0];
		double dnum[] = new double[10];		//고정 배열
		
		//추가하려면 add()
		arr2.add(1);
		arr2.add(2);
		
		System.out.println(arr2.get(0)); //0번방의 값
		
		//전부다 보고 싶으면 size()
		for(int i=0; i<arr2.size();i++)
		{
			System.out.println(); 		//배열의 경우 값을 넣지 않은 공간에 대해서 if문 처리
		}
	}
}
