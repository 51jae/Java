package Iostream;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class MySoceketServer {

	public static void main(String[] args) 
	{
		MyServer server = new MyServer();
		server.start();
	}

}
class MyServer extends Thread
{	
	//서버 소켓은 내 컴퓨터의 ip를 자동으로 움직임
	//port는 정재야함
	//서버는 접속용 소켓 1개과 통신용 소켓 여러개를 따로 관리
	ServerSocket serverScocket;	//서버를 시작하기 위한 (점속용)
	Socket socket; //각소켓을 관리하기 위한 소켓 ( 개개인별)
	
	//사용자의 정보와 ip를 지정 할 수 없는 map
	HashMap<String , ClientHandler> clients = new HashMap<>();
	
	@Override
	public void run()
	{
		//소켓을 연다
		try {
			serverScocket = new ServerSocket(7979);	//소켓을 연다 ( 서버 시작)
			while(true)
			{
				System.out.println("서버 시작 - 요청 - 대기");
				socket = serverScocket.accept(); //클라이언트의 접속을 대기하고 들어오면 socket에 옮김
				System.out.println("접속한 클라이언트 : "+ socket.getLocalPort());
				
				String clientIP = socket.getInetAddress().toString();
				//Mysever : 접속용 쓰레드, clientHandler ㅣ 통신용 쓰레드
				ClientHandler client = new ClientHandler(socket);
				clients.put(clientIP, client); // 사용자 정보 배열 map로 저장
				client.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
class ClientHandler extends Thread
{
	InputStream is;	//클라이언트의 메시지를 받을 수 있게
	OutputStream os;	//클라이언트에 메시지를 보낼 수 있게
	ObjectInputStream ois;	//매핑
	ObjectOutputStream oos;//매핑
	Socket socket;
	String cilentIP;
	
	public ClientHandler(Socket socket)
	{
		this.socket = socket;
		cilentIP = socket.getInetAddress().toString();
	}
	@Override
	public void run()
	{
		try {
			is=socket.getInputStream();
			os=socket.getOutputStream();
			ois = new ObjectInputStream(is);
			oos = new ObjectOutputStream(os);
			while(true)
			{
				String msg = (String)ois.readObject();	//메시지를 받음(받을때까지 대기함
				System.out.println("클라이언트 메시지 : "+msg);
				oos.writeObject("서버로부터 되돌아온 메시지 : "+msg);	//클라이언트에 메시지 전송
			}
		} catch (IOException e) {
			e.printStackTrace();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}