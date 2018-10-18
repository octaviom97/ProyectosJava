 import java.util.*;
public class Hanoi { 
  /**Se declaran las variables y el número de torres*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Numero de aros que pasaras: ");
        n = sc.nextInt();
        Hanoi(n,1,2,3); 
    } 
    /**En esta parte empieza a mostar en salida estandar como se van cambiando los aros de una torre a otra.*/
public static void Hanoi(int n, int origen,  int auxiliar, int destino){
  if(n==1)
  System.out.println("mover disco de " + origen + " a " + destino);
  else{
     Hanoi(n-1, origen, destino, auxiliar);
     System.out.println("mover disco de "+ origen + " a " + destino);
     Hanoi(n-1, auxiliar, origen, destino);
   }
 }
}