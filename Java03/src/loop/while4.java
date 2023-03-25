package loop;

public class while4 {

	public static void main(String[] args)
	{
		//while문은 ()조건식이 틀리면 {} 실행안함
		
		//do ~ while : 일단 먼저 실행하고 조건검사를 해서 반복여부 결정
		int i=0;
		do {
			System.out.println("적어도 한번은 무조건 실행 보장");
			i++;
		}while(i < 0);
		
		
	}

}
