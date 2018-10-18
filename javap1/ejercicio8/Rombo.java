import java.util.Scanner;
/**Se inicializa la clase*/
public class Rombo {
    /**Creamos el metodo principal "main"*/
    public static void main(String[] args)

    {
        /**Declaramos nuestras variables*/
        int valor,num;
        int i=0,j=0,k=0;
        Scanner sc = new Scanner(System.in);

        /**Obtenemos el valor recibido*/
        System.out.println("Introduce tamaño de tu rombo: ");
        valor = sc.nextInt();
        num = (valor+(valor-1));

        /**Parte superior del rombo*/
        for(i=1;i<=num;i=i+2)
        {
            /**Añadimos los espacios necesarios delante de cada linea*/
            for(k=num+1;k>=i;k=k-2)
            {
                System.out.print(" ");
            }
            /**Mostramos los asteriscos*/
            for(j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        /**Parte inferior del rombo*/
        for(i=num;i>=1;i=i-2)
        {
            /**Añadimos los espacios necesarios delante de cada linea*/
            for(k=i;k<=num+2;k=k+2)
            {
                System.out.print(" ");
            }

            /**Mostramos los asteriscos*/
            for(j=i-2;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}