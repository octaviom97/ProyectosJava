/**En nuestra clase principal es donde haremos el flujo 
principal del programa e instanciaremos los objetos con sus 
parametros correspondientes*/
public class Principal{
	public static void main(String[] args) {
		/**El polimorfismo se da cuando a través de la clase Coche (clase padre)
		podemos crear un objeto que se defina como la clase hija*/
		Coche carro = new Coche("Blanco",4,100000);
		Coche carro2 = new Audi("Audi","Rojo",4,200000);

		/**Imprimimos los valores de nuestros objetos*/
		System.out.println("Los datos de la clase Coche son");
		System.out.println(carro.mostrarInformacion());
		System.out.println();
		System.out.println("Los datos de la clase Audi son");
		System.out.println(carro2.mostrarInformacion());
		System.out.println("Costo: $"+carro2.getCosto());
		System.out.println();


	}
}