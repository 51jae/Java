package operator;

public class Oper6 
{
	public static void main(String[] args) 
	{
		//관계 연산자
		// && , || , !
		//true false 영향을 줌 
		
		//&& : and(그리고), 앞과 뒤가 모두 true여야함 true라고 알려줌
		System.out.println(2>1&&2==2);
		
		int 키 = 120;
		int 나이 = 14;
		//키는 130 이상이고 나이는 13살이 어야한다.
		boolean 참거짓 = 키 >=130 && 나이 >=13;
		System.out.println(참거짓);
		//&& 기호는 앞뒤 둘다 맞아야함
		//키가 130 이상이거나 나이가 13살 이상이어야한다.
		참거짓 = 키>=130 || 나이>=13;
		// || : or 혹은 , 앞또는 뒤가 true면  true
		System.out.println(참거짓);
		// ! : not 결과를 반대로 바꿈 false> true true > false
		System.out.println(!참거짓);
	}
}
