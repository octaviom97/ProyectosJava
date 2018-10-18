
/**
Creamos nuestra clase que se llamará en este caso Coche,
y a través de la abstracción es que definiremos sus 
atributos y métodos usando nuestra percepción de la 
realidad.
*/
public class Coche{
	/**Definimos sus atributos*/
	public String color;
	public int numPuertas;
	/** 
	Ahora con el encapsulamiento es que podemos 
	restringir el acceso ciertos atributos y/o métodos
	que consideremos necesario, esto con la finalidad
	de mantener la integridad de nuestros datos y/o 
	protegerlos de personas que no deban tener acceso 
	a esta información. Para esto utilizamos la palabra 
	reservada "private". 

	*/
	private int costo;

	/**Definimos los métodos*/
	public void avanza(){
		System.out.println("El coche se movió");
	}

	/** Definimos el método constructor que será con el 
	que instanciemos los valores que recibirá cada objeto
	coche que creemos.
	*/
	public Coche(String color, int numPuertas, int costo){
		this.color = color;
		this.numPuertas = numPuertas;
		this.costo = costo;
	}

	/**
	Para acceder a un atributo encapsulado utilizamos los 
	métodos Setters y Getters, esto con la finalidad de
	poder usar el atributo pero manteniendo su integridad
	*/

	public void setCosto(int costo){
		this.costo = costo;
	}

	public int getCosto(){
		return costo;
	}

	/**
	Ahora definimos el método que cambiará con cada clase 
	nueva que creemos, así usando el polimorfismo (Se 
	explicará en la siguiente clase).
	*/

	public String mostrarInformacion(){
		return "Color: "+color+"\nNúmero de puertas: "+numPuertas+"\nCosto: $"+costo;
	}

}