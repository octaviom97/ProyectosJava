/**Duo dinamico Prebe 10 y 13 Martinez Osorio Octavio y Serrano Sansón Jorge Alejandro*/

public class Persona{
	/**Aqui metemos los atributos de la clase*/
static int contador = 0;
private String nombre;
private Pets pets;
private String nombrePets;
private String telefono;
	/**hacemos el metodo constructor*/
	Persona(){
		pets = new Pets();
		contador++;
	}

	
	Persona(String nombre, String telefono){
		setNombre(nombre);
		setTelefono(telefono);
		pets = new Pets();
		contador++;
	}

	
	public void setPets(String nomPets){
		Pets.setNombre(nomPets);
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getNombre(){
		return nombre;	
	}

	public void setTelefono(String telefono){
		this.telefono = telefono;
	}

	public String getTelefono(){
		return telefono;
	}
	public String getPets(){
		return pets.getNombre();
	}
}