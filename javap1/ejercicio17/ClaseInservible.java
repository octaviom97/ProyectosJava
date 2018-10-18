/**Hacemos la clase abstracta para que no se puedan instanciar objetos*/
abstract class ClaseInservible extends Object{
	/**Se crean el metodo normal y el estatico*/
	public abstract void hacerAlgo();
	public static void ejecutarEstatico(){
		System.out.println("Me jalaron por ser estático");
	}

}

