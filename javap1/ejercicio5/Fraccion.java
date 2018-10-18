import java.util.Scanner;

/** Primero creamos nuestra clase que tendrá el método main */
public class Fraccion{
	public static void main(String[] args) {
	/**Declaramos las variables y objetos que utilizaremos en el programa*/
	Scanner sc = new Scanner(System.in);
	int num1, num2;
	int div,i;
	/**Iniciamos el programa preguntando los números que se recibiran y luego se escanean.
	Luego se muestra la fracción completa*/
	System.out.println("Introduce el primer número de la fracción");
	num1 = sc.nextInt(); 
	System.out.println("Introduce el segundo número de la fracción");
	num2 = sc.nextInt();
	System.out.println("\nTu fracción es");
	System.out.println(num1+" / "+num2); 

	/**Ejecución del programa, aquí se utiliza un ciclo for que evaluará una condición de control 
	si los números de la fracción pueden ser divididos del 9 al 2 */
	div=9;
	for (i=9;i>1;i--) {
		
		if (num1%div == 0 && num2%div == 0) {
			do{
				num1/=div;
				num2/=div;
			} while (num1%div == 0 && num2%div == 0);
		}
		div--;
	} 

	/**
	Se imprime el resultado
	*/
	System.out.println("La expresión mínima de la fracción es:");
	System.out.println(num1+" / "+num2);

	
	}
}