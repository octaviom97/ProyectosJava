
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.io.Serializable;

public class Cliente{
  private PrintStream clienteOut;
  private String host;
  private int port;
  private String nick;
  private String mi_ip;
  

  public void setHost(String host){
    this.host = host;
  }
  public void setPort(int port){
    this.port = port;
  }
  public void setNick(String nick){
    this.nick = nick;
  }

  public String getNick(){
      return nick;
  } 

  public String getMiIp(){
      return mi_ip;
  } 
  public BufferedReader conectar(BufferedReader entrada) throws IOException{
    Socket server = new Socket(host,port);
    mi_ip = reduce(server.getInetAddress().toString());
    clienteOut = new PrintStream(server.getOutputStream());
	entrada = new BufferedReader(new InputStreamReader(server.getInputStream()));
	return entrada;
	
  }
  public void enviar(String mensaje) throws IOException{
    clienteOut.println(mensaje);
  }
  public void cerrar() throws IOException{
    clienteOut.close();
  }

  public String reduce(String cad){
    cad = cad.substring(1,cad.length());
    return cad;
  }


  public static void main(String[] args) throws IOException{
    BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    Cliente cliente = new Cliente();
    System.out.print("Host: ");
    cliente.setHost(teclado.readLine());
    System.out.print("Puerto: ");
    cliente.setPort(Integer.parseInt(teclado.readLine()));
    System.out.print("Nick: ");
    cliente.setNick(teclado.readLine());
    entrada = cliente.conectar(entrada);
    String str = "";
	String v = "";
    int control = 0;
	
    ArrayList<String> IpsMenu = new ArrayList<String>();

    System.out.println("\tEntraste al servidor");
    System.out.println("Añadete al chat con el comando 'add'.");
    while(control==0){
    str = teclado.readLine();
      if (str.equals("add")){

        System.out.println("Usuario añadido");
        cliente.enviar(cliente.getMiIp());
        cliente.enviar(cliente.getNick());
        do{
        System.out.print("Escribe tu comando: ");
          str = teclado.readLine();
          if(str.equals("text")){
          System.out.print("Mensaje: ");
          str = teclado.readLine();
          cliente.enviar(str);
          } else if (str.equals("text_to")){
            System.out.println("Mensaje privado");
            

          } else if (str.equals("list")){
            System.out.println("Lista de usuarios:");
            System.out.println(IpsMenu);
            

          } else if (str.equals("send_file")){
            System.out.println("Enviar archivo");

          } else{System.out.println("Comando incorrecto");}
			v=entrada.readLine();
			System.out.print(v);
			
        } while(!str.equals("quit"));
        cliente.cerrar();
        control=1;
      } else {System.out.println("Error, usa el comando 'add' para añadirte al chat.");}

    } 
  }
}

