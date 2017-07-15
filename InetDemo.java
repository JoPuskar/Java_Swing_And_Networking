import java.net.*;
import java.io.*;

public class InetDemo{
	public static void main(String[] args){
		try{
		InetAddress address = InetAddress.getByName("www.honeydoze.com");

		System.out.println("Host Name:" +address.getHostName());
		System.out.println("IP Address: " +address.getHostAddress());
	}catch(UnknownHostException e){
		e.printStackTrace();
		}
	}
}