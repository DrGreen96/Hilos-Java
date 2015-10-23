package Tarea4_Hilos;

/*
 * @Alba y Eduardo
 */
class HiloDescontrolado extends Thread {
	 
    public void run() {
       int i = 1;
       while (true){
            System.out.println (i++);
       }
    }
}
public class ControladorDescontrolado {
      @SuppressWarnings("deprecation")
		public static void main(String args[]) throws InterruptedException {
      	
              Thread hi = new HiloDescontrolado();
              System.out.println(" ****** Comienza el controlador descontrolado: ****** ");
              hi.start();
              Thread.sleep(1000);
              hi.stop();
              System.out.println(" ****** Finaliza el controlador descontrolado: ****** ");
        }
}
