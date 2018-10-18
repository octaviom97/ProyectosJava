/**Prebe Mart mamalona por prebe 10 Octavio y 13 Jorge*/

import java.util.Scanner;


/**Metodo principal que genera el flujo del programa*/
public class MainPMart{

	/**Metodo main*/	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String comelineas;
		Lista l = new Lista();
		boolean bool = true;
		String nom;
		int precio;
		int opcion, op, dejar;

		/***/
		System.out.println("\tWelcome to my crib PrebeMart");
		System.out.println("La pasarás a todo dar (emoji guiñando)");
		do{
		System.out.println("\n¿Qué quieres hacer?\n");
		System.out.println("1.- Añadir producto");
		System.out.println("2.- Mostrar compra");
		System.out.println("3.- Salir");
			System.out.println("Elige tu opcion: ");
			opcion = sc.nextInt();
			comelineas = sc.nextLine();

			switch(opcion){
				case 1:
					System.out.println("Nombre del producto: ");
					nom = sc.nextLine();
					System.out.println("Precio del producto: ");
					precio = sc.nextInt();
					l.setProducto(nom,precio);

				break;

				case 2:
					System.out.println("\n\tTus productos son");
					l.encenderLista();
					System.out.println("\n1.- ¿Quieres dejar un producto?");
					System.out.println("2.- Salir");
					System.out.println("Elige una opcion: ");
					opcion = sc.nextInt();

					switch(opcion){
						case 2:
							if(l.getTotal() > 500){
								System.out.println("\nTu limite son 500 prebedolares");
								System.out.println("No te alcanza camarada, eres pobre :(");
								l.shouProducto();
									System.out.println("¿Que producto vas a regresar? Si está roto te lo cobro igual >:(");
									dejar = sc.nextInt();
									l.regresarProducto(dejar);
							} else{
								System.out.println("Gracias por tus compras, no hay reembolso :)");
								bool = false;
							}
						break;

						case 1:
							l.shouProducto();
							// do{
								System.out.println("Que producto deseas dejar?");
								dejar = sc.nextInt();
								l.regresarProducto(dejar);
								// System.out.println("Deseas dejar otro producto? 1/SI 0/NO");
								// op = sc.nextInt();
							// }while(op == 1);
						break;
					}

				break;

				case 3:
					System.out.println("Regresa pronto al PrebeMart ( Ponme 10 porfa :( )");
					bool=false;
				break;

				default:
				System.out.println("Eliges la única opción que no se puede, que tranza");
				break;
			}
		}while(bool == true);
	}
}