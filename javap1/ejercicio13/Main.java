/**Creamos nuestra clase principal*/
public class Main{
	/**Iniciamos nuestro metodo principal*/
	public static void main(String[] args) {
		/**Instanciamos cada objeto */
		Dog pe = new Dog();
		Cat ca = new Cat();
		Bird bi = new Bird();
		Mouse mo = new Mouse();
		Cow cow = new Cow();
		Frog fr = new Frog();
		Elephant el = new Elephant();
		Duck du = new Duck();
		Fish fi = new Fish();
		Seal se = new Seal();

		/**Imprimimos los metodos de cada objeto*/
		System.out.print("Dog goes "); pe.dice();
		System.out.print("Cat goes "); ca.dice();
		System.out.print("Bird goes "); bi.dice();
		System.out.print("And mouse goes "); mo.dice();
		System.out.print("Cow goes "); cow.dice();
		System.out.print("Frog goes "); fr.dice();
		System.out.print("And the elephant goes "); el.dice();
		System.out.print("Ducks says "); du.dice();
		System.out.print("And fish go "); fi.dice();
		System.out.print("And the seal goes "); se.dice();

	}
}