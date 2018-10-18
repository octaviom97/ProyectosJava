/**La clase leon hereda animal carnivoro */
public class Leon extends AnimalCarnivoro{
	/**Definimos sus atributos especificos*/
	String nombre = "Leon";
	String comidaFav = "becerritos";
	String juego = "becerritos"; 
	String sonido = "MEOW de Rey";

	/**Definimos los métodos herdados*/
	public void miNombre(){
		System.out.println(nombre);
		System.out.println();
	}

	public void hacerSonido(){
		System.out.println("El león hace: "+sonido);
		System.out.println("Los animales carnívoros hacen: "+super.sonido);
		System.out.println();
	}

	public void jugar(){
		System.out.println("El león juega a perseguir: "+juego);
		System.out.println("A todos los animales carnívoros les gusta: "+super.juego);
		System.out.println();
	}

	public void miComida(){
		System.out.println("La comida favorita del león son los: "+comidaFav);
		System.out.println("Los animales carnívoros comen: "+super.comidaFav);
		System.out.println();
		
	}
}

