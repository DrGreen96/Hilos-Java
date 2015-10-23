package Tarea4_Hilos;
/*
 * @Alba y Eduardo
 */
class fiboInterface implements Runnable {
	
    Thread hilo;
    int numeros;
    
    
    fiboInterface (int numeros) {
         this.numeros=numeros;
         hilo = new Thread (this, "¡¡¡¡¡¡ Esto es un HILO FIBONACCI !!!!!!");
         hilo.start();
    }
    
    public void run() {
         System.out.print("Las " + numeros + " primeros cifras de la serie Fibonacci son: ");
         int f1=1;
         int f2=1;
         System.out.print(f1 + " ");
         for(int i=2;i<=numeros;i++){
             System.out.print(f2 + " ");
             f2 = f1 + f2;
             f1 = f2 - f1;
         }
         System.out.println();
    }
}
public class FibonacciInterface {
    public static void main(String args[]) {
           new fiboInterface(10);
    }
}
