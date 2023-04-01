package cls;

public class Method4 {
	public static void main(String[] args) 
	{
		int result = 4+5;
		MyClass7 mc7 = new MyClass7();
		int result2 = mc7.더하기(4, 5);
		System.out.println(result2);
		
		int result3 = 7-1;
		int result4 = mc7.빼기(7, 1);
		System.out.println(result4);
		
		int result5= 8*8;
		int result6=mc7.곱하기(8, 8);
		System.out.println(result6);
		
		double result7=64/8;
		double result8=mc7.나누기(64,8);
		System.out.println(result8);
		
		
	}

}

class MyClass7
{
	int 더하기 (int num1, int num2)
	{
		int result = num1+num2;
		
		return result;
	}
	
	int 빼기 (int num3, int num4)
	{
		int result3=num3-num4;
		return result3;
	}
	
	int 곱하기 (int num5 , int num6)
	{
		int result5= num5*num6;
		return result5;
	}
	
	double 나누기 (double num7,double num8)
	{
		double result7= num7/num8;
		double result= 0.0;
		if (num8==0) {
			return result7;
		}
		else 
		{
			result7= num7/num8;
		}
		return result7;
	}
	
	int 나머지구하기(int num1,int num2)
	{
		int result=0;
		result = num1-((num1/num2)*num2);
//		while(true)
//		{
//			if(num1 < num2)
//			{
//				break;
//			}
//			num1-=num2;
//		}
//		return num1;
		return result;
	}
}
