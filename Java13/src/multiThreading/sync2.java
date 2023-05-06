package multiThreading;

public class sync2 
{

	public static void main(String[] args) 
	{
		cgcloth ct = new cgcloth();
		Thread 사람1 = new Thread(ct,"사람1");
		Thread 사람2 = new Thread(ct,"사람2");
		Thread 사람3 = new Thread(ct,"사람3");
		
		사람1.start();
		사람2.start();
		사람3.start();
		
	}
}

//의상 탈의실
//의류 가게에서는 한 사람이 옷을 갈아입으로 탈의 실에 들어가면 나올때 까지 밖에서 대기릴 해줘여함(10초)
class cgcloth implements Runnable
{
	private int time;
	@Override
	public void run() 
	{
		synchronized (this)
		{
			String name = Thread.currentThread().getName();
			System.out.println(name+"탈의실에 사람 들어감");
			for(int time=1;time<=10;++time)
			{
				try {
					Thread.sleep(1000);
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
				System.out.println(name+"탈의실 사용중.."+time+"초");
			}
			System.out.println(name+"탈의실 나옴");
			
		}
	
	}
	
}