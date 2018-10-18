/**
Ahora utilizaremos la herencia.
Esta es básicamente la extensión de una clase a otra
donde se nombran una clase padre y una o varias clases 
hijas, cuando tu clase que va a heredar tiene todas 
las características de la clase padre pero tendra otras
características propias. Esto se da porque usualmente la 
clase padre es una abstracción muy general de objetos
más específicos. Para utilizar la herencia utilizamos la 
palabra reservada "extends" de tu clase hija a la clase
padre.
*/
public class Audi extends Coche{

	public String marca;
	/**En el constructor mandamos a llamar los atributos de la 
	clase padre y a la propia*/
	public Audi(String marca,String color,int numPuertas,int costo){
		super(color,numPuertas,costo);
		this.marca = marca;
	}
	/**Usamos el getter para obtener el atributo*/
	public String getMarca(){
		return marca;
	}

	/**Sobre escribimos el metodo traido desde la clase padre
	y le indicamos que muestre los datos recibidos de los atributos*/
	@Override public String mostrarInformacion(){
		return "Color: "+color+"\nNúmero de puertas: "+numPuertas+"\nMarca: "+marca;
	}



}
