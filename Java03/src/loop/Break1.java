package loop;

public class Break1 {

	public static void main(String[] args)
	{
		//제어문에는 같이 쓰일 수 있는 break , continue 가 있다
		//break : 반복문 강제 종료(자기를 감싸고 있는)
		while(true)
		{
			//무한반복
			System.out.println("무한반복 ");
			if(true)
			{
				break;	//자신을 감싸고 있는 반복문을 끝냄
			}
			System.out.println("위에서 이미 반복문이 종료되어 이곳은 도달하지 경우하지 않는다");
		}
		System.out.println("종료");
		for(int i=1;i<=100;i++)
		{
			if(i>3)
			{
				break; //i가 3보다 크면 반복문 종료
			}
			System.out.print(i+" ");
		}
		
	}

}
