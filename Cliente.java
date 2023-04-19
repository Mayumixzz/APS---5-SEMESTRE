package pacote;
import java.net.Socket;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Cliente {
	
	public static void main(String[] args) {
	String tHost;
	int tPorta = 10000;
	Socket tSocket;
		
		while(true) { //Colocando um Host
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Digite um HOST:");
				tHost = br.readLine();
				
				//Reconhecendo o Host e Porta
				tSocket = new Socket(tHost,tPorta);
				
				System.out.println("Conexao foi estabelecida");
				
				System.out.println("Porta Local:" + tSocket.getLocalPort());
				
				System.out.println("In Buffer Size: "+ tSocket.getReceiveBufferSize());
				
				System.out.println("Out Buffer Size: "+ tSocket.getSendBufferSize());
				
				System.out.println("Tempo expirado: "+ tSocket.getSoTimeout());
				
				System.out.println("Continua ai? : "+ tSocket.getKeepAlive());
				
				//Fecha conexão
				//tSocket.close();

				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
		}
   }
}