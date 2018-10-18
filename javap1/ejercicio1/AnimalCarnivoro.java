/**Creamos nuestra clase de animal carnívoro que implementa la interfaz animal*/
public abstract class AnimalCarnivoro implements Animal{
	/**Creamos los atributos y los definimos de forma general para los animales carnívoros*/
	String comidaFav="carne";
	String juego="correr";
	String sonido="super MEOW";

	/**Sobre escribimos el método de la interfaz Animal*/
	@Override public void hacerSonido(){}

	/**Creamos los métodos que se heredarán de la clase*/
	public void miNombre(){}

	public void jugar(){}

	public void miComida(){}

	
}
