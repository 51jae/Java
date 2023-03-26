package review;

import java.util.Scanner;

public class Review {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//1.1~10 중 짝수만 출력
				for(int i=1;i<=10;i++)
				{
					if(i % 2 ==1)
					{
						continue;
					}
					System.out.println("짝수 : "+i);
				}
				//2.비밀번호 맞추기 (기회 5번 이 넘어가면 정지 , 정수, 맞추면 맞췄다 하고 종료, 기회를 모두 사용시 접속불가)
//				int pwd =1234;
//				int user_input = 0;
//				
//				for(int i=0;i<5;i++)
//				{
//					System.out.println("비번 입력 : ");
//					user_input = sc.nextInt();
//					if(user_input == pwd)
//					{
//						System.out.println("일치");
//						break;
//					}
//					if(i == 4)
//					{
//						System.out.println("접속불가");
//					}
//			}
				//3. 시험합격 점수는 국어,영어,수학 각40점 이상이고 총 점수가 150점 ㅁ이상이면 합격
				// 40점 이하의 점수가 있으면 과락, 각 과목이 40점 이상이나 총점이 미달되었으면 총점미달
				int kor = 39;
				int eng = 40;
				int math= 40;
				int sum= kor+eng+math;
				if(kor >=40 && eng >= 40 && math >=40 && sum >=150)
				{
					System.out.println("합격");
				}
				else
				{
					System.out.println("과락, 미달 ");
				}
				
					
			
				//4. 1~10까지의 합
				int sum1=0;
				for(int i=1;i<=10;i++)
				{
					sum1+=i;
				}
				System.out.println("1부터 10까지의 합"+sum1);
				//5. 10~1까지 거꾸로 출력
				for(int i=10;i>=1;i--)
				{
					System.out.println(i);
				}
			}

}

	
	
