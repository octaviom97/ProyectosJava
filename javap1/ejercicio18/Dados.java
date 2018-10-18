/**Importamos las bibliotecas que se usaran en el programa*/
import java.util.Random;
import java.util.Scanner;		

/**Creamos la clase */
public class Dados{
	/**Iniciamos el metodo principal*/
	public static void main(String[] args) {
		/**Declaramos los atributos que se usaran en el programa*/
		int op,cont=0;
		int[] arr = {0,0,0,0,0,0};
		int[] arr2 = {0,0,0,0,0,0,0,0,0,0,0,0};
		Scanner sc = new Scanner(System.in);
		do{
		/**Pedimos los datos*/
		System.out.println("\n¿Quieres tirar los dados?\n1) Si\n2) No");
		op = sc.nextInt();

		/**Con un switch definimos las opciones que se eligieron y se empieza a ejecutar la accion
		de aleatorio para cada simulacion de tiro de dado*/
		switch(op){
		case 1:
			Random random = new Random();
			int dado1 = 1+random.nextInt(6);
			if(dado1==1){
				arr[0]+=1;
			} else if(dado1==2) {
				arr[1]+=1;
			} else if (dado1==3) {
				arr[2]+=1;
			} else if (dado1==4) {
				arr[3]+=1;
			} else if (dado1==5) {
				arr[4]+=1;
			} else if (dado1==6) {
				arr[5]+=1;
			}
			int dado2 = 1+random.nextInt(6);
			if(dado2==1){
				arr[0]+=1;
			} else if(dado2==2) {
				arr[1]+=1;
			} else if (dado2==3) {
				arr[2]+=1;
			} else if (dado2==4) {
				arr[3]+=1;
			} else if (dado2==5) {
				arr[4]+=1;
			} else if (dado2==6) {
				arr[5]+=1;
			}
			int dado3 = dado1 + dado2;
			if(dado3==2) {
				arr2[1]+=1;
			} else if (dado3==3) {
				arr2[2]+=1;
			} else if (dado3==4) {
				arr2[3]+=1;
			} else if (dado3==5) {
				arr2[4]+=1;
			} else if (dado3==6) {
				arr2[5]+=1;
			} else if (dado3==7) {
				arr2[6]+=1;
			} else if (dado3==8) {
				arr2[7]+=1;
			} else if (dado3==9) {
				arr2[8]+=1;
			} else if (dado3==10) {
				arr2[9]+=1;
			} else if (dado3==11) {
				arr2[10]+=1;
			} else if (dado3==12) {
				arr2[11]+=1;
			} 
			System.out.println("El resultado del dado 1 es: "+dado1);
			System.out.println("El resultado del dado 2 es: "+dado2);
			System.out.println("El resultado total es: "+dado3);
			cont++;
		break;
		/**Se imprimen los datos almacenados*/
		case 2:
			System.out.println("\nLas estadísticas de "+cont+" lanzamiento(s) de cada dado fueron:");
			System.out.println("Veces que cayó 1: "+arr[0]);
			System.out.println("Veces que cayó 2: "+arr[1]);
			System.out.println("Veces que cayó 3: "+arr[2]);
			System.out.println("Veces que cayó 4: "+arr[3]);
			System.out.println("Veces que cayó 5: "+arr[4]);
			System.out.println("Veces que cayó 6: "+arr[5]);
			System.out.println("\nLas estadísticas de "+cont+" lanzamiento(s) del total fueron:");
			System.out.println("Veces que cayó 2: "+arr2[1]);
			System.out.println("Veces que cayó 3: "+arr2[2]);
			System.out.println("Veces que cayó 4: "+arr2[3]);
			System.out.println("Veces que cayó 5: "+arr2[4]);
			System.out.println("Veces que cayó 6: "+arr2[5]);
			System.out.println("Veces que cayó 7: "+arr2[6]);
			System.out.println("Veces que cayó 8: "+arr2[7]);
			System.out.println("Veces que cayó 9: "+arr2[8]);
			System.out.println("Veces que cayó 10: "+arr2[9]);
			System.out.println("Veces que cayó 11: "+arr2[10]);
			System.out.println("Veces que cayó 12: "+arr2[11]);
			System.out.println("\nAdios :D\n");
		break;
		}

	} while (op!=2);
	

	}
}