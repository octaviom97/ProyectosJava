/**La clase tigre hereda animal carnivoro*/
public class Tigre extends AnimalCarnivoro{
	/**Se definen sus atributos especificos*/
	String nombre = "Tigre";
	String comidaFav = "conejos";
	String juego = "conejitos"; 
	String sonido = "MEOOOW de gato grande";

	/**Se definen los metodos heredados*/
	public void miNombre(){
		System.out.println(nombre);
		System.out.println();
	}

	public void hacerSonido(){
		System.out.println("El tigre hace: "+sonido);
		System.out.println("Los animales carnívoros hacen: "+super.sonido);
		System.out.println();
	}

	public void jugar(){
		System.out.println("El tigre juega a perseguir: "+juego);
		System.out.println("A todos los animales carnívoros les gusta: "+super.juego);
		System.out.println();
	}

	public void miComida(){
		System.out.println("La comida favorita del tigre son los: "+comidaFav);
		System.out.println("Los animales carnívoros comen: "+super.comidaFav);
		System.out.println();
		
	}
}

