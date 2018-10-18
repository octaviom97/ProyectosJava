/** En esta clase definimos las caracteristicas de las mascotas
Martinez Osorio Octavio prebe 10
Serrano Sansón Jorge Alejandro #13*/

public class Pets{

	private String nombre;

	/**Aqui creamos el constructor vacio*/
	Pets(){

	}
	Pets(String nombre){
		setNombre(nombre);
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getNombre(){
		return nombre;
	}
}