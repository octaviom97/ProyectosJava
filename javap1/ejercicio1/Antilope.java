/**La clase antilope herda animal herbivoro*/
public class Antilope extends AnimalHerbivoro{
	/**Se definen sus atributos especificos*/
	String nombre = "Antilope";
	String comidaFav = "hongos locos cainal";
	String juego = "programar en java con sus amigos"; 
	String sonido = "nadie sabe, como el zorro";
	/**Se definen sus metodos heredados*/
	public void miNombre(){
		System.out.println(nombre);
		System.out.println();
	}

	public void hacerSonido(){
		System.out.println("El antilope hace: "+sonido);
		System.out.println("Los animales herbívoros hacen: "+super.sonido);
		System.out.println();
	}

	public void jugar(){
		System.out.println("El antilope juega a: "+juego);
		System.out.println("A todos los animales herbívoros les gusta: "+super.juego);
		System.out.println();
	}

	public void miComida(){
		System.out.println("La comida favorita del antilope son los: "+comidaFav);
		System.out.println("Los animales herbívoros comen: "+super.comidaFav);
		System.out.println();
		
	}
}

