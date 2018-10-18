/**Se crea la clase principal*/
public class Prueba{
	/**En el metodo main se instancian los objetos de las clases*/
	public static void main(String[] args) {
		Perro a = new Perro();
		Gato b = new Gato();
		Vaca c = new Vaca();
		/**Se imprimen los metodos*/
		System.out.println("El perro dice: "+a.animalDice("Woof Woof"));
		System.out.println("El gato dice: "+a.animalDice("Meow Meow"));
		System.out.println("La vaca dice: "+a.animalDice("Moo Moo"));
		
	}
}