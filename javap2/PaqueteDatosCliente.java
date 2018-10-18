// 8  Montiel Martínez Luis Javier
// 10 Martínez Osorio Octavio 
 
import java.io.Serializable;

public class PaqueteDatosCliente implements Serializable{ //esta interfaz permite el envio de los atributos de un obj de esta clase ya instanciado
//poder ser enviados como un flujo de bytes a travez del chat 
	private String nick, ip,message,mi_ip;
	
	public void setNick(String nick){
		this.nick = nick;
	}
	
	public void setMiIp(String mi_ip){
		this.mi_ip = mi_ip;
	}

	public void setIp(String mi_ip){
		this.mi_ip = mi_ip;
	}
	
	public void setIpDest(String ip){
		this.ip = ip;
	}
	
	public void setMessage(String message){
		this.message = message;
	}
	
	public String getNick(){
		return nick;
	}
	
	public String getIp(){
		return ip;
	}
	
	public String getMiIp(){
		return mi_ip;
	}

	public String getIpDest(){
		return ip;
	}
	
	public String getMessage(){
		return message;
	}
}