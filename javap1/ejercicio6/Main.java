/**Duo dinamico Prebe 10 y 13 Martinez Osorio Octavio y Serrano Sansón Jorge Alejandro*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main{

	/**Creamos un menu para Las opciones que manejaremos*/
	public static void menu(){
		System.out.println("Agenda del ejercicio 6");
		System.out.println("Introduce tu opción");
		System.out.println("1.-Iniciar la agenda");
		System.out.println("2.-Agregar un registro");
		System.out.println("3.-Eliminar un solo registro");
		System.out.println("4.-Buscar un registro");
		System.out.println("5.-Drop table a tu agenda");
		System.out.println("6.-Salir");
	}
	/**Iniciamos el main para hacer el flujo del programa*/
	public static void main(String[] args){
		ArrayList<Agenda> agendas = new ArrayList<Agenda>();
		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		Agenda agend;
		Agenda agendaCreada;
		String nombre, telefono, pets;
		int opcion, contador = 0;
		Boolean bandera = true;
		int numAgenda = 0;

		do{
			menu();
			System.out.println("Qué quieres hacer? ");
			opcion = entrada.nextInt();

			switch(opcion){
				case 1:
					System.out.println("Creando tu agenda");
					agendaCreada = new Agenda();
					agendas.add(agendaCreada);
					contador++;
					System.out.println("Esta es tu agenda numero: " + contador);
				break;

				case 2:

					System.out.println("En que agenda vas a hacer modificaciones. ");
					numAgenda = entrada.nextInt();
					numAgenda = numAgenda - 1;
					if(agendas.size() == 0){
						System.out.println("Esa agenda no eczis t");
					}else if (numAgenda > agendas.size()){
						System.out.println("Primero crea una agenda");
					}else{
						if(agendas.size() > 0){
							System.out.println("Haciendo registro");
							System.out.println("\n");
							System.out.println("Nombre: ");
							nombre = entrada2.nextLine();
							System.out.println("Telefono: ");
							telefono = entrada2.nextLine();
							System.out.println("Mascota: ");
							pets = entrada2.nextLine();
							agendas.get(numAgenda).agregarPersona(nombre,telefono,pets);
						}else{
							System.out.println("No se que paso pero un programador dice que algo salio mal");
						}
					}
					
				break;

				case 3:
					System.out.println("En que agenda vas a borrar");
					numAgenda = entrada.nextInt();
					numAgenda = numAgenda - 1;
					if(numAgenda > agendas.size()){
						System.out.println("Esa agenda no la conozco ");
					}else{
						System.out.println("Que registro vas a borrar");
						nombre = entrada2.nextLine();				
						agendas.get(numAgenda).eliminarPersona(nombre);	
					}
					
				break;

				case 4:
					System.out.println("En cual agenda se va a buscar");
					numAgenda = entrada.nextInt();
					numAgenda = numAgenda - 1;
					if(numAgenda > agendas.size()){
						System.out.println("Esa agenda no existe");
					}else{
						System.out.println("Que registro vas a buscar");
						nombre = entrada2.nextLine();				
						agendas.get(numAgenda).buscarPersona(nombre);	
					}
				break;


				case 5:
					System.out.println("Cual agenda vas a vaciar");
					numAgenda = entrada.nextInt();
					numAgenda = numAgenda - 1;
					if(numAgenda > agendas.size()){
						System.out.println("Esa agenda no existe, intentalo otra vez mas tarde");
					}else{
						agendas.get(numAgenda).borrarTodo();
					}
				break;

				case 6:
					System.out.println("Bye Bye Matane");
					bandera = false;
				break;

				default:
					System.out.println("Estas mal perro");
				break;
			};

		}while(bandera == true);

	}

}