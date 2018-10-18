import java.util.Scanner;
/**Creamos la clase*/
public class Binario{
	/**Creamos el metodo principal "main*/
	public static void main(String[] args) {
		/**Definimos sus atributos*/
		int n,i,j;
		int cont2 = 0;
		int cont = 0;
		Scanner sc = new Scanner(System.in);

		/**Empieza el programa pidiendo los datos que se modificaran*/
		System.out.println("\n¿Cuántos números vas a ingresar?");
		n = sc.nextInt();
		/**Se crean los arreglos que guardaran los valores de cada proceso*/
		int[] arr = new int[n];
		String[] arrb = new String[n];
		Integer[] arrcont = new Integer[10];
		String[] arr1 = new String[n];
		String[] arr2 = new String[n];
		String[] arr3 = new String[n];
		String[] arr4 = new String[n];

		/**En el ciclo for guardamos los valores del entero y se guarda como binario el mismo*/
		for (i=0; i<n ; i++) {
		System.out.println("Introduce el número "+(i+1)+":");
		arr[i] = sc.nextInt();
		arrb[i] = Integer.toBinaryString(arr[i]);
		}
		System.out.println("");

		/**Se imprime cada numero convertido a binario*/
		for (i=0; i<n ; i++) {
			System.out.println("El número "+arr[i]+" en binario es:");
			System.out.println(arrb[i]);

				/**El ciclo while cuenta los uno's y los almacena para dividirlos*/
				while (cont < arrb[i].length()) {
					if (arrb[i].charAt(cont) == '1'){
						cont2++;
				    }
				cont++;
				}  
				arrcont[i] = cont2;
				cont2=0;
				cont=0;
				if (arrcont[i]==1){
					arr1[i]=arrb[i];
				} else if (arrcont[i]==2) {
					arr2[i]=arrb[i];
				} else if (arrcont[i]==3){
					arr3[i]=arrb[i];
				} else if (arrcont[i]==4){
					arr4[i]=arrb[i];
				}

		System.out.println();
		
		}

			/**Cada ciclo imprime los numeros que correspondan a su cantidad de uno's*/
			System.out.println("Binarios con 1 uno:");
			for (i=0;i<n;i++) {
				if(arr1[i]!=null){
				System.out.println(arr1[i]);
				}
			}

			System.out.println("Binarios con 2 unos:");
			for (i=0;i<n;i++) {
				if(arr2[i]!=null){
				System.out.println(arr2[i]);
				}
			}

			System.out.println("Binarios con 3 unos:");
			for (i=0;i<n;i++) {
				if(arr3[i]!=null){
				System.out.println(arr3[i]);
				}
			}

			System.out.println("Binarios con 4 unos:");
			for (i=0;i<n;i++) {
				if(arr4[i]!=null){
				System.out.println(arr4[i]);
				}
			}		
		
		System.out.println();

				
	
			


	}


}