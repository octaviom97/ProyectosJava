import java.util.Scanner;

/**Creamos nuestra clase*/
public class Determinante{
	/**Definios los atributos de la clase*/
	Scanner sc = new Scanner(System.in);
	public int filas = 0;
	public int columnas = 0;
	public int arr [][];
	public int e;

	/**Creamos el constructor*/
	public Determinante(int m){
		this.filas = m;
		this.columnas = m;
		arr = new int [filas][columnas];

	}

	
	/**	Método que almacenara los valores de la Matriz	*/
	public void completarMa(){
		for(int i = 0; i < filas; i++){
			for (int j = 0; j < columnas; j++) {
				System.out.println("Introduce el elemento en [" +i+ "] [" +j+ "]" );
				e = sc.nextInt();
				arr[i][j] = e;
			}
		}
	}

	/**Creamos el metodo que ejecutara las operaciones para obtener la determinante	*/
	public double obtenerDeterminante(int[][] arr){
		double det;
    	if(arr.length == 2)
    	{
        	det = (arr[0][0]*arr[1][1])-(arr[1][0]*arr[0][1]);
        	return det;
    	}

    	double suma=0;

    	for(int i = 0; i < arr.length; i++){
    		int [][] nm = new int [arr.length-1][arr.length-1];
        	for(int j=0; j < arr.length; j++){
            	if(j != i){
                	for(int k = 1; k < arr.length; k++){
                		int indice =- 1;
                		if(j < i)
                			indice = j;
                		else if( j > i)
                			indice=j-1;
                		nm[indice][k-1] = arr[j][k];
                	}
                }
            }

        	if(i%2==0){
        		suma += arr[i][0] * obtenerDeterminante(nm);
        	}else{
        		suma -= arr[i][0] * obtenerDeterminante(nm);
    		}
    	}
    		return suma;
	}
}	