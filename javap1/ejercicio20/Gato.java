import java.io.*; 
import javax.swing.JOptionPane;
public class Gato {
 
		/**Definimos nuestro metodo principal*/
        public static void main(String[] args)throws IOException { 
        	/**Se declaran las variables*/
                BufferedReader recibir=new BufferedReader (new InputStreamReader(System.in));
                String juego[][];
                juego = new String[3][3];
                int n=0;
                int fila;
                int columna;
                for (int a=0; a<=2; a=a+1) {
                for (int b=0; b<=2; b=b+1) {
                juego[a][b]=" ";
                int dato;
                int dato1;
                int datob;
                int datob2;
                }
 
                }
                /**Aquí se muestra el tablero del juego*/
System.out.println("Hey muy buenas a todos guapísimos aqui los prebes en un gameplay en directo de Gato buah chaval flipo");
System.out.println("            0   1   2\n");
System.out.println("        0   "+juego[0][0]+" | "+juego[0][1]+" | "+juego[0][2]);
System.out.println("           -----------");
System.out.println("        1   "+juego[1][0]+" | "+juego[1][1]+" | "+juego[1][2]);
System.out.println("           -----------");
System.out.println("        2   "+juego[2][0]+" | "+juego[2][1]+" | "+juego[2][2] + "\n");
 
while (n<10) { 
 
        int dato, dato1;
       
/** Aquí usamos panel para mostrar de manera más amigable al usuario*/
JOptionPane.showMessageDialog(null,"Es tu turno Yugi Moto eres la X ");
 
do{
dato=Integer.parseInt(JOptionPane.showInputDialog(" Seleccione fila.(Es la horizontal)"));
}
while (dato<0 || dato>2);
 
do{
dato1=Integer.parseInt(JOptionPane.showInputDialog("Seleccione columna.(Es la vertical)"));
 
}
while (dato1<0 || dato1>2);
 
 
while (juego[dato][dato1]== "X" || juego[dato][dato1]== "O" ) { /**Si ya hay un valor existente, manda mensaje de error*/
JOptionPane.showMessageDialog(null, "¿Qué paso paps? estas tirando donde ya había algo");
 
do{
dato=Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione una fila. (Es la --)"));
}
while (dato<0 || dato>2);
do{
dato1=Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione una columna. (Es la que es así |)"));
}
while (dato1<0 || dato1>2);
}
juego[dato][dato1] = "X";

 
System.out.println("        \n Tu turno \n");
System.out.println("            0   1   2\n");
System.out.println("        0   "+juego[0][0]+" | "+juego[0][1]+" | "+juego[0][2]);
System.out.println("           -----------");
System.out.println("        1   "+juego[1][0]+" | "+juego[1][1]+" | "+juego[1][2]);
System.out.println("           -----------");
System.out.println("        2   "+juego[2][0]+" | "+juego[2][1]+" | "+juego[2][2] + "\n");
 
n=n+1;
 
 
 
 /**En esta parte se revisa si se cumplen 3 en linea*/
if (juego[0][0]== "X" && juego[0][1]== "X" && juego [0][2]== "X") {
        JOptionPane.showMessageDialog(null, "Ganaste, ya eres Hokage");
break;
}
if (juego[1][0]== "X" && juego[1][1]== "X" && juego [1][2]== "X") {
        JOptionPane.showMessageDialog(null, "Ganaste, ya eres Hokage");
break;
}
else if (juego[2][0]== "X" && juego[2][1]== "X" && juego [2][2]== "X") {
        JOptionPane.showMessageDialog(null, "Ganaste, ya eres Hokage");
break;
}
if (juego[0][0]== "X" && juego[1][0]== "X" && juego [2][0]== "X") {
        JOptionPane.showMessageDialog(null, "Ganaste, ya eres Hokage");
break;
}
if (juego[0][1]== "X" && juego[1][1]== "X" && juego [2][1]== "X") {
        JOptionPane.showMessageDialog(null, "Ganaste, ya eres Hokage");
break;
}
if (juego[0][2]== "X" && juego[1][2]== "X" && juego [2][2]== "X") {
        JOptionPane.showMessageDialog(null, "Ganaste, ya eres Hokage");
break;
}
if (juego[0][0]== "X" && juego[1][1]== "X" && juego [2][2]== "X") {
        JOptionPane.showMessageDialog(null, "Ganaste, ya eres Hokage");
break;
}
if (juego[0][2]== "X" && juego[1][1]== "X" && juego [2][0]== "X") {
        JOptionPane.showMessageDialog(null, "Ganaste, ya eres Hokage");
break;
}
 

 
if (n==9) {
break;
}
 
/**En esta parte la maquina con la clase random decide donde tirar y le muestra al usuario en donde se ve el tiro de la maquina*/
JOptionPane.showMessageDialog(null,"Es el turno de Seto Kaiba (Es el circulo)");
 
int datob;
datob = (int)(Math.random()*3)+0;
 
int datob2;
datob2 = (int)(Math.random()*3)+0;
JOptionPane.showMessageDialog(null,"La maquina escogio..."+
                              "\nFila: "+datob+"\nColumna: "+datob2);
System.out.println("\n Turno del rival \n");

while (juego[datob][datob2]== "O" || juego[datob][datob2]== "X" ) {
 
datob = (int)(Math.random()*3)+0;
datob2 = (int)(Math.random()*3)+0;
 
}
juego[datob][datob2] = "O";

System.out.println("            0   1   2\n");
System.out.println("        0   "+juego[0][0]+" | "+juego[0][1]+" | "+juego[0][2]);
System.out.println("           -----------");
System.out.println("        1   "+juego[1][0]+" | "+juego[1][1]+" | "+juego[1][2]);
System.out.println("           -----------");
System.out.println("        2   "+juego[2][0]+" | "+juego[2][1]+" | "+juego[2][2] + "\n");
 
n=n+1;

/**Si la maquina logra 3 alineados, se mostrara el mensaje que el usuario perdio*/
if (juego[0][0]== "O" && juego[0][1]== "O" && juego [0][2]== "O") {
        JOptionPane.showMessageDialog(null, "Kaiba logró invocarte a Exodia y pues te ganó");
break;
}
if (juego[1][0]== "O" && juego[1][1]== "O" && juego [1][2]== "O") {
        JOptionPane.showMessageDialog(null, "Kaiba logró invocarte a Exodia y pues te ganó");
break;
}
if (juego[2][0]== "O" && juego[2][1]== "O" && juego [2][2]== "O") {
        JOptionPane.showMessageDialog(null, "Kaiba logró invocarte a Exodia y pues te ganó");
break;
}
if (juego[0][0]== "O" && juego[1][0]== "O" && juego [2][0]== "O") {
        JOptionPane.showMessageDialog(null, "Kaiba logró invocarte a Exodia y pues te ganó");
break;
}
if (juego[0][1]== "O" && juego[1][1]== "O" && juego [2][1]== "O") {
        JOptionPane.showMessageDialog(null, "Kaiba logró invocarte a Exodia y pues te ganó");
break;
}
if (juego[0][2]== "O" && juego[1][2]== "O" && juego [2][2]== "O") {
        JOptionPane.showMessageDialog(null, "Kaiba logró invocarte a Exodia y pues te ganó");
break;
}

if (juego[0][0]== "O" && juego[1][1]== "O" && juego [2][2]== "O") {
        JOptionPane.showMessageDialog(null, "Kaiba logró invocarte a Exodia y pues te ganó");
break;
}
if (juego[0][2]== "O" && juego[1][1]== "O" && juego [2][0]== "O") {
        JOptionPane.showMessageDialog(null, "Kaiba logró invocarte a Exodia y pues te ganó");
break;}

 
if (n==9) {
break;
}
 
}
 
}
}