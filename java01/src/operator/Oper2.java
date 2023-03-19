package operator;

public class Oper2 
{
	public static void main(String[] args) 
	{
		int 국어 =49;
		int 영어 = 40;
		int 수학 = 60;
			//합계와 평균 구하기
		int sum = 국어+영어+수학;
		
		int avg = sum/3;
		/*
		 * 합계 : 00점
		 * 평균 : 00점
		 */
		System.out.println("합계 :"+sum);
		System.out.println("평균 : "+avg);
		System.out.println("평균 : "+((double)sum/3));
	}
}
