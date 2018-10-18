/**Prebe Mart mamalona por prebe 10 Octavio y 13 Jorge*/

import java.util.ArrayList;

/** Clase lista que lleva el control de los productos  */

public class Lista{
	ArrayList<String> nombres = new ArrayList<String>();
	ArrayList<Integer> precios = new ArrayList<Integer>();
	public int total;

	/**Creamos los metodos para obtener el nombre y precio de los productos*/ 
	public void setNombre(String nombre){
		nombres.add(nombre);
	}

	
	public String getNombre(int n){
		return nombres.get(n);
	}

	
	public void setPrecio(int precio){
		precios.add(precio);
	}

	
	public int getPrecios(int n){
		return precios.get(n);
	}

	
	public void setProducto(String nombre, int precio){
		setNombre(nombre);
		setPrecio(precio);
	}

	
	public int getTotal(){
		return total;
	}

	/**	Metodo para mostrar la lista (ENCENDER LISTA) = (ENCENDER AUTOU) */
	public void encenderLista(){
		total = 0;
		System.out.println("\nLista de productos: ");
		for(int i = 0; i < nombres.size(); i++){
			System.out.println("Producto: " + nombres.get(i) + " \nPrecio: " + precios.get(i));
			total = total + precios.get(i);
		}
	}

	/** Mostramos los indices del producto para poder modificarlos */
	public void shouProducto(){
		total = 0;
		System.out.println("\nLista de productos: \n");
		for(int i = 0; i < nombres.size(); i++){
			System.out.println("\tIndice: #" + (i+1) + " Producto: " + nombres.get(i) + " Precio: " + precios.get(i));
			System.out.println();
			total = total + precios.get(i);
		}
	}

	/** Eliminar producto */
	public void regresarProducto(int n){
		precios.remove(n-1);
		nombres.remove(n-1);
		System.out.println("No tiene nada mal, puedes regresarlo (emoji de ok)");
	}

}