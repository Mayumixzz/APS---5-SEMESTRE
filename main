import java.net.ServerSocket;


public class main
public static void main(String[] args) {
    ServerSocket serversocket = new ServerSocket(port:4000);
    Socket socket = serverSocket.accept();
    System.out.println("cliente conectou");


    InputStreamReader inputReader = new InputStreamReader(socket.getInputStream());
    PrintStream saida = new PrintStream(socket.getOutputStream());
    BufferReader reader = new BufferReader(inputReader);
    String x;
    while((x = reader.readLine())!=null) {


        saida.println("Servidor: " + x);


    }
