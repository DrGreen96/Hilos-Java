package Tarea4_Hilos;

/*
 * @Alba y Eduardo
 */
class hiloRunnable implements Runnable {
    Thread hiloR;
    int contador;
    hiloRunnable (int contador) {
         this.contador=contador;
         hiloR = new Thread (this, "¡¡¡¡¡ Esto es un HILO FIBONACCI !!!!!");
         hiloR.start();
    }
    public void run() {
           try {
               System.out.println (" ********* Comienza la cuenta atrás en: *********");
               for (int i=contador;i>0;i--){
                   System.out.println(" ********* En: "+i+" *********");
                   Thread.sleep(1000);
               }
               System.out.println (" ********* Finalizada la cuenta atrás. *********");
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
    }
}
public class CuentaAtras {
  public static void main(String args[]) {
       new hiloRunnable(10);
  }
}
