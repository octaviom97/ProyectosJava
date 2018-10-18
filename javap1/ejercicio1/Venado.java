/**La clase venado hereda animal herbivoro*/
public class Venado extends AnimalHerbivoro{
	/**Se definen sus atributos especificos*/
	String nombre = "Venado";
	String comidaFav = "sus amigos los arboles";
	String juego = "tropezar como bambi"; 
	String sonido = "Nooooo, mamá :(";

	/**Se definen los metodos heredados*/
	public void miNombre(){
		System.out.println(nombre);
		System.out.println();
	}

	public void hacerSonido(){
		System.out.println("El venado hace: "+sonido);
		System.out.println("Los animales herbívoros hacen: "+super.sonido);
		System.out.println();
	}

	public void jugar(){
		System.out.println("El venado juega a: "+juego);
		System.out.println("A todos los animales herbívoros les gusta: "+super.juego);
		System.out.println();
	}

	public void miComida(){
		System.out.println("La comida favorita del venado son los: "+comidaFav);
		System.out.println("Los animales herbívoros comen: "+super.comidaFav);
		System.out.println();
		
	}
}

