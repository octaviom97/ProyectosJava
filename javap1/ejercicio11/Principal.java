import java.util.Scanner;
import java.util.ArrayList;

public class Principal{

	/**Metodo principal main que hara el flujo del programa*/
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int tam;
		double determinante;
		Determinante arr;
	
		System.out.println("¿De qué tamaño va a ser tu matriz?");
		tam = sc.nextInt();
		arr = new Determinante(tam);
		arr.completarMa();
		determinante = arr.obtenerDeterminante(arr.arr);
		System.out.println("\nLa determinante es: " + determinante+"\n");

	}
}