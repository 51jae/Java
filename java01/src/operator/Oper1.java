package operator;

public class Oper1
{
	public static void main(String[] args)
	{
		//프로그래밍은 기본적으로
		//위에서 아래로 , 왼에서 오로 진행	
		int 숫자1 =3;
		int 숫자2 = 2;
		System.out.println((숫자1 - 숫자2) * 숫자2);
		System.out.println(((숫자1 -숫자2)*숫자2));
		
		System.out.println(20/4/1);
		//지금 자료형이 int (소수점이 없는 숫자)이기 떄문에
		// 나누기를 한다음 소수점은 '삭제';
		System.out.println(3/2);    //1.5 x ,1 
		
		System.out.println(3/2.0);
		}
}
