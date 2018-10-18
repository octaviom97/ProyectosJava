/**La clase cebra hereda de animal herbivoro*/
public class Cebra extends AnimalHerbivoro{
	/**Se definen sus atributos*/
	String nombre = "Cebra";
	String comidaFav = "ensaladitas trukutru";
	String juego = "cantar con Alex de Madagascar"; 
	String sonido = "como bien raro la neri";
	/**Se definen los metodos heredados*/
	public void miNombre(){
		System.out.println(nombre);
		System.out.println();
	}

	public void hacerSonido(){
		System.out.println("La cebra hace: "+sonido);
		System.out.println("Los animales herbívoros hacen: "+super.sonido);
		System.out.println();
	}

	public void jugar(){
		System.out.println("La cebra juega a: "+juego);
		System.out.println("A todos los animales herbívoros les gusta: "+super.juego);
		System.out.println();
	}

	public void miComida(){
		System.out.println("La comida favorita del cebra son las: "+comidaFav);
		System.out.println("Los animales herbívoros comen: "+super.comidaFav);
		System.out.println();
		
	}
}

