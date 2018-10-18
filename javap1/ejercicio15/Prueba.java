/**Martinez Osorio Octavio #10 y Serrano Sansón Jorge Alejandro #13*/

import java.util.ArrayList;
import java.util.Arrays;
public class Prueba{

/**Iniciamos el metodo principal y instanciamos el objeto que usaremos*/
public static void main(String[] args) {

ClasePerf<Object> perf = new ClasePerf<Object>();
perf.metodoEquis();
perf.clone();
perf.equals();
perf.finalize();
perf.hashCode();
perf.toString();

ArrayList<ClasePerf> arruno = new ArrayList<ClasePerf>();
int tam = arruno.size(); System.out.println(tam);
for(int i=0;i<5;i++){
arruno.add(new ClasePerf());
}
tam = arruno.size();
System.out.println(tam);
arruno.get(0).atruno = 5;
arruno.get(1).atruno = 6;
arruno.get(2).atruno = 8;
arruno.get(3).atruno = 1;
arruno.get(4).atruno = 5;

int [] enteros = new int[tam];
int i = 0;
for (ClasePerf a: arruno) {
  enteros[i] = a.atruno;
  i++;
}
for (int b = 0;b<5;b++) {
  System.out.print(enteros[b]+"_");
}
Arrays.sort(enteros);
for (int b = 0;b<5;b++) {
  System.out.print(enteros[b]+"_");
}


ArrayList<ClasePerf> arrdos = new ArrayList<ClasePerf>();
for (int n = 0; n<5; n++){
for (int f = 0; f<arruno.size(); f++){
if(arruno.get( f).atruno == enteros[ n]){
arrdos.add(arruno.get( f));
arruno.remove( f);
}
}
}
for (ClasePerf a : arrdos) {
  System.out.print(a.atruno + "_");
}
System.out.println();
  }
}
