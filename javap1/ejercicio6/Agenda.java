/**Duo dinamico Prebe 10 y 13 Martinez Osorio Octavio y Serrano Sansón Jorge Alejandro*/

import java.util.ArrayList;


public class Agenda{
	ArrayList<Persona> agenda = new ArrayList<Persona>();
	public void agregarPersona(String nombre, String telefono, String nombrePet){
		Persona persona = new Persona();
		persona.setNombre(nombre);
		persona.setTelefono(telefono);
		persona.setPets(nombrePet);//Que petz esto me marca error 
		agenda.add(persona);
	}

	/**Metodo para remover una persona en la agenda*/
	public void eliminarPersona(String nombre){
		for(int i = 0; i < agenda.size(); i++){
			if(agenda.get(i).getNombre().equals(nombre)){
				System.out.println("Has eliminado un registro");
				agenda.remove(i);
			}else{
				System.out.println("No tienes registrado a esa persona");
			}
			
		}

	}
	/**Metodo para buscar persona en la agenda*/
	public void buscarPersona(String nombre){
		if(agenda.size() == 0){
			System.out.println("No hay registros");
		}else{
			for(int i = 0; i < agenda.size(); i++){
				if(agenda.get(i).getNombre().equals(nombre)){
					System.out.println("Esta es la información del registro: ");
					System.out.println("Nombre: " + agenda.get(i).getNombre());
					System.out.println("Telefono: " +  agenda.get(i).getTelefono());
					System.out.println("Mascota: " + agenda.get(i).getPets());
				}else{
					System.out.println("No tienes registrado a esa persona");
				}
			}
		}
	}

	/**Con este metodo se borran todos los datos de la agenda*/
	public void borrarTodo(){
		System.out.println("Dile adios a tus contactos");
		agenda.clear();
	}


}