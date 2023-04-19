package pacote;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerSocket1 {
	public static void main(String[] args) {
		try {
			ServerSocket servidor = new ServerSocket(25565);
			
			System.out.println("Esperando uma conexão...");
			
			//esperando conexão do cliente com o servidor
			Socket cliente = servidor.accept();
			
			//System.out.println("Conexão estabelecida");
			
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
}