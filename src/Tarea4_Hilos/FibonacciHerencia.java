package Tarea4_Hilos;

/*
 * @Alba y Eduardo
 */
class fiboHerencia extends Thread {
	int numeros;

    public fiboHerencia (int numeros){
        this.numeros=numeros;
    }

    public void run() {
          System.out.print("Las " + numeros + " primeras cifras de la serie Fibonacci son: ");
          int fibo1=1;
          int fibo2=1;
          System.out.print(fibo1 + " ");
          for(int i=2;i<=numeros;i++){
                System.out.print(fibo2 + " ");
                fibo2 = fibo1 + fibo2;
                fibo1 = fibo2 - fibo1;
          }
          System.out.println();
    }

}

public class FibonacciHerencia {
	public static void main(String args[]) throws InterruptedException {
		Thread Hilo = new fiboHerencia(10);
		Hilo.start();
	}
}
