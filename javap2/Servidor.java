// 8  Montiel Martínez Luis Javier
// 10 Martínez Osorio Octavio

import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintStream;
import java.io.IOException;
import java.util.ArrayList;
import java.io.Serializable;
import java.io.DataOutputStream;

public class Servidor extends Thread{
  private String nombreCliente;
  private BufferedReader entrada;
  private PrintStream salida;
  public static ArrayList<PaqueteDatosCliente> lip = new ArrayList<PaqueteDatosCliente>();
  public static ArrayList<Servidor> as = new ArrayList<Servidor>();
  
//agregando usuarios

  public Servidor(Socket cliente) throws IOException{
    entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
    salida = new PrintStream(cliente.getOutputStream());
    System.out.println("Conexion aceptada desde: " + cliente.getRemoteSocketAddress());
    PaqueteDatosCliente nu = new PaqueteDatosCliente();
    nu.setMiIp(recibir());
    nu.setNick(recibir());
    nombreCliente=nu.getNick();
    System.out.println("datos: "+nu.getMiIp()+" "+nu.getNick());
    lip.add(nu);

    
  }

  public String recibir() throws IOException{
    String str = entrada.readLine();
    return str;
  }
  public void cerrar() throws IOException{
    entrada.close();
  }

  public int conexionCio(String msn){
      salida.println(msn);
      return 1;
  }

  @Override
  public void run(){
    try{
      String str = "";
      while(!str.equals("quit")){
        str = recibir();
        System.out.println(nombreCliente +" dice "+str);
        System.out.println("usuarios");
        for(int i =0;i<lip.size();i++){
            as.get(i).conexionCio("Alguien envio: "+str+"\n");
        }



      }
    }catch (IOException e) {
      System.out.println("Se cerro la conexion con " + nombreCliente);
    }finally{
      try{
        cerrar();
      }catch(IOException ex){}
    }
  }
  public static void main(String[] args) throws IOException{
    ArrayList<PaqueteDatosCliente> ips = new ArrayList<PaqueteDatosCliente>();
    ServerSocket ss;
    ss = new ServerSocket(9998);
    System.out.println("Servidor aceptando conexiones en el puerto " + ss.getLocalPort());
    while(true){
      System.out.println("esperando");
      Socket cliente = ss.accept();
      System.out.println("esperando2");
      as.add(new Servidor(cliente));
      as.get(as.size()-1).start();
      ips=lip;
            
    }
  }
}

