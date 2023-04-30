package collection_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Set1
{
	public static void main(String[] args) 
	{
		//list,set,map
		//list : 동적배열(순서0,중복0)
		//set : list에서 중복이 불가능하게함(순서x중복x)
		//map : 방번호를 내가 정함, {키:값, 키:값}(키와값의 쌍으로 구성)
		
		//set:HashSet(순서x중복x),TreeSet(오름차순 정렬o,중복x)
		//Iterator : Set 전체 사용을 위해서 많이 쓰임 (Set이 순서가 없어서 순서를 할당)
		//set : map을 사용할때, 중복값을 없애는 기능이 필요할때
		HashSet<Integer> hs = new HashSet<>(); //Set은 중복이 안된다
		
		//추가 add
		hs.add(1);
		hs.add(2);
		hs.add(4);
		hs.add(1);
		hs.add(2);
		hs.add(3);
		
		//전체 조회 Iterator
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		// 1 2 3 4
		
		//TreeSet : HashSet + 정렬 기능 
		TreeSet<String> ts = new TreeSet<>();
		ts.add("a");
		ts.add("b");
		ts.add("d");
		ts.add("a");
		ts.add("b");
		ts.add("c");

//		Iterator<String> iter = ts.iterator();
//		while(iter.hasNext())
//		{
//			System.out.println(iter.next());
//		}
		for(String element : ts)
		{
			System.out.println(element);
		}
		
		int 배열[] = {1,2,3,4,5,6,7,8,9};
		//전체 조회(일반 for문)
//		for(int i=0; i<nums.length;++i)
//		{
//			System.out.print(nums[i]+"  ");
//		}
		//for each (배열 전용for문)
		for(int 임시 : 배열)
		{
			System.out.print(임시+" ");
		}
	}
}
