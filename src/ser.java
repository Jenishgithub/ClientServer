import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ser {
	public static void main(String[] args) throws IOException {
		int number, temp;

		ServerSocket s1 = new ServerSocket(1342);
		Socket ss = s1.accept();// server has to accept connection from client
								// first

		// server takes the number sent from client
		Scanner sc = new Scanner(ss.getInputStream());
		number = sc.nextInt();// save input to variable
		temp = number * 2;

		// server sends the modified numnber to client
		PrintStream p = new PrintStream(ss.getOutputStream());
		p.println(temp);
	}
}
