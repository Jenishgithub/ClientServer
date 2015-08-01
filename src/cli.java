import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class cli {
	public static void main(String[] args) throws UnknownHostException,
			IOException {
		int number, temp;

		// takes the input from the user using scanner object
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();// save input to variable

		// 127.0.0.1 is local host address, client and server are on the same
		// machine
		Socket s = new Socket("127.0.0.1", 1342);// port address and port number
		// client sends the input from user to server

		PrintStream p = new PrintStream(s.getOutputStream());
		p.println(number);

		// after server does calculations on number, client takes the
		// modified number from server
		Scanner sc1 = new Scanner(s.getInputStream());
		temp = sc1.nextInt();
		System.out.println(temp);
	}
}
